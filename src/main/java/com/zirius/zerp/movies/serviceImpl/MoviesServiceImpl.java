package com.zirius.zerp.movies.serviceImpl;

import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.zirius.zerp.constants.ErrorCodes;
import com.zirius.zerp.constants.MovieConstants;
import com.zirius.zerp.movies.controller.MoviesController;
import com.zirius.zerp.movies.dao.MoviesDAO;
import com.zirius.zerp.movies.model.Movie;
import com.zirius.zerp.movies.request.MovieRequest;
import com.zirius.zerp.movies.response.MovieResponse;
import com.zirius.zerp.movies.response.Response;
import com.zirius.zerp.movies.service.MoviesService;
import com.zirius.zerp.movies.util.MovieNotFoundException;

@Service
@Transactional
public class MoviesServiceImpl implements MoviesService {

	public static final Logger LOGGER = LoggerFactory.getLogger(MoviesServiceImpl.class); 
	
	@Autowired
	private MoviesDAO moviesDao;

	@Value("${omdbapi.url}")
	private String OMDBAPI_URL;
	@Value("${omdbapi.key}")
	private String omdbAPIKey;

	private final static String OMDBAPI_MOVIE_QUERYPARAM = "?t={movie}";
	private final static String OMDBAPI_YEAR_QUERYPARAM  = "&y={year}";
	private final static String OMDBAPI_APIKEY_QUERYPARAM = "&apikey=";

	@Override
	public Response getMovieByTitle(String title, String year) {
		Movie movie;
		Response response = null;
		if (Optional.ofNullable(title).isPresent()) {
			movie = moviesDao.getMovieByTitle(title, year);
			response = buildResponse(movie);
		} else {
			throw new MovieNotFoundException(title);
		}
		return response;
	}

	private Response buildResponse(Movie movie) {
		MovieResponse movieResponse = new MovieResponse();
		Response response = new Response();
		response.setStatus(MovieConstants.SUCCESS);
		response.setMessage(MovieConstants.MOVIEMESSAGE);
		movieResponse.setTitle(movie.getTitle());
		movieResponse.setRuntime(movie.getRunTimeMinutes());
		response.setData(movieResponse);
		return response;
	}

	@Override
	public String getMovieByTitleFromOMDBAPI(String title, String year) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		String omDBGetUrl = buildGetUrl(title, year);
		String result = restTemplate.getForObject(omDBGetUrl, String.class, title, year);
		return result;
	}

	private String buildGetUrl(String title, String year) {

		StringBuilder sb = new StringBuilder(OMDBAPI_URL);
		sb.append(OMDBAPI_MOVIE_QUERYPARAM);
		if(Optional.ofNullable(year).isPresent())
			sb.append(OMDBAPI_YEAR_QUERYPARAM);
		sb.append(OMDBAPI_APIKEY_QUERYPARAM);
		sb.append(omdbAPIKey);
		return sb.toString();
	}

	@Override
	public Response saveMovie(MovieRequest movieReq) {
		Response response = new Response();
		response.setStatus(MovieConstants.FAILURE);
		response.setMessage(ErrorCodes.RECORD_ALREADY_EXIST);
		String title = movieReq.getTitle(), year = movieReq.getYear(), language = movieReq.getLanguage();
		if (Stream.of(title, year, movieReq.getYear(), language).allMatch(Objects::nonNull)) {

			if (!moviesDao.isMovieAlreadyPresent(title, year, language)) {
				Movie movie = new Movie();
				movie.setTitle(title);
				movie.setYear(Integer.valueOf(year));
				movie.setLanguage(language);
				movie.setIsActive(Boolean.TRUE);
				moviesDao.saveMovie(movie);
				response.setStatus(MovieConstants.SUCCESS);
				response.setMessage(MovieConstants.SAVED);
			}

		}
		return response;

	}

	@Override
	public Response updateMovie(MovieRequest movieReq, long id) {
		Response response = new Response();
		response.setStatus(MovieConstants.FAILURE);
		response.setMessage(ErrorCodes.RECORD_NOT_FOUND);
		Optional<Movie> movieOptional = Optional.ofNullable(moviesDao.findById(id));
		if (movieOptional.isPresent()) {
			Movie movie = movieOptional.get();
			movie.setTitle(movieReq.getTitle());
			movie.setYear(Integer.valueOf(movieReq.getYear()));
			movie.setLanguage(movieReq.getLanguage());
			movie.setIsActive(movieReq.getIsActive());
			moviesDao.saveMovie(movie);
			response.setStatus(MovieConstants.SUCCESS);
			response.setMessage(MovieConstants.UPDATED);
		}
		return response;

	}

}
