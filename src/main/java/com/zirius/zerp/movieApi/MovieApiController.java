package com.zirius.zerp.movieApi;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zirius.zerp.movieApi.dao.MovieDetailRequest;
import com.zirius.zerp.movieApi.dao.MovieDetailResponse;
import com.zirius.zerp.movieApi.dao.MovieDetails;
import com.zirius.zerp.movieApi.dao.OMDBDetail;
import com.zirius.zerp.movieApi.dao.SqlRepository;

@RestController
public class MovieApiController {
	
	@Autowired SqlRepository sqlRespository;
	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}
	
			//create
			@RequestMapping(value="/movie/create", method=RequestMethod.POST,consumes = "application/json")
			@ResponseStatus(HttpStatus.CREATED)
			public String createMovie(@Valid @RequestBody MovieDetailRequest movie) {
				sqlRespository.saveToDB(movie.getId(),movie.getMovie_name(),movie.getRelease_year(),movie.getMovie_type(),movie.getRating());
				return "The movie detail has been saved to DB";
			}
			
			//update
			@RequestMapping(value="/movie/update", method=RequestMethod.POST,consumes = "application/json")
			@ResponseStatus(HttpStatus.CREATED)
			public String updateMovieType(@Valid @RequestBody MovieDetailRequest movie) {
				sqlRespository.updateMovie(movie.getId(),movie.getMovie_name(),movie.getRelease_year(),movie.getMovie_type(),movie.getRating());
				return "Update success";
			}
	
			//read
			@RequestMapping(value="/movie/read", method=RequestMethod.GET)
			public MovieDetailResponse getPerson() {
				List<MovieDetails> movieDetailsList=sqlRespository.findByid();
				MovieDetailResponse response=new MovieDetailResponse();
				response.setMovieList(movieDetailsList);
				return response;
			}
		
			//External API call
			@RequestMapping(value="/omdb/read", method=RequestMethod.GET)
			public OMDBDetail omdbDetails() {
				OMDBDetail omdbDeatil=new OMDBDetail();
				RestTemplate restTemplate=new RestTemplate();
				omdbDeatil=restTemplate.getForObject("http://www.omdbapi.com?i=tt3896198&apikey=6612e496", OMDBDetail.class);
				return omdbDeatil;
			}
}
