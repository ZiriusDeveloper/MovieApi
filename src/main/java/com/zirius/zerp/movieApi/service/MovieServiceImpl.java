package com.zirius.zerp.movieApi.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zirius.zerp.movieApi.bean.MovieList;
import com.zirius.zerp.movieApi.entity.MovieDetails;
import com.zirius.zerp.movieApi.repo.MovieRepo;


@Service
public class MovieServiceImpl implements MovieService {
	
	private @Autowired RestTemplate restTemplate;
	
	private @Autowired MovieRepo movieRepo;

	@Value("${omdb.apikey}")
	private String omdb_apikey;
	
	Logger logger  = LoggerFactory.getLogger(MovieServiceImpl.class);
	
	public List<MovieDetails> getMovies() {
		return movieRepo.findAll();
	}	
	 
	public ResponseEntity<?> createMovie(MovieDetails movieDetails) {
		try {
			movieRepo.save(movieDetails);
			return new ResponseEntity<>("Movie created successfully", HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage());
			return new ResponseEntity<>("Internal Server Error", HttpStatus.BAD_REQUEST);
		}
	}
	
	public ResponseEntity<?> updateMovie(MovieDetails movieDetails) {
		try {
			movieRepo.save(movieDetails);
			return new ResponseEntity<>("Movie updated successfully", HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage());
			return new ResponseEntity<>("Internal Server Error", HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public MovieList getOmdblist(String title) {
		MovieList md = (MovieList) restTemplate.getForObject("http://www.omdbapi.com/?s="+title+"&apikey="+omdb_apikey, MovieList.class);
		return md;
	}

	@Override
	public ResponseEntity<?> getMovieList(String type, String year) {
		try {
			return new ResponseEntity<>(movieRepo.findByTypeAndYear(type, year), HttpStatus.OK);
		} catch(Exception ex) {
			logger.error(ex.getMessage());
			return new ResponseEntity<>("Internal Server Error", HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@Override
	public ResponseEntity<?> getOmdbMovieList(String type, String year) {
		try {
			MovieList movieList = (MovieList) restTemplate.getForObject("http://www.omdbapi.com/?t="+type+"&y="+type+"&apikey="+omdb_apikey, MovieList.class);
			return new ResponseEntity(movieList, HttpStatus.OK);
		} catch( Exception ex ) {
			logger.error(ex.getMessage());
			return new ResponseEntity<>("Internal Server Error", HttpStatus.BAD_REQUEST);
		}
	}
}
 