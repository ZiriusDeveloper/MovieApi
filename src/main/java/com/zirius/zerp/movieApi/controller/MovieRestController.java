package com.zirius.zerp.movieApi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zirius.zerp.movieApi.entity.MovieDetails;
import com.zirius.zerp.movieApi.service.MovieService;
import com.zirius.zerp.movieApi.util.Constants;

@RestController
@RequestMapping(Constants.ROOT_URL)
public class MovieRestController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping(path = Constants.MOVIE_LIST_URL, produces = Constants.PRODUCES)
	public ResponseEntity<?> getMovieList(@RequestHeader(name ="type", required = true) String type, @RequestHeader(name ="year", required = true) String year) {
		return movieService.getMovieList(type, year);
	}
	
	@GetMapping(path = Constants.OMDB_MOVIE_LIST_URL, produces = Constants.PRODUCES)
	public ResponseEntity<?> getOmdbMovieList(@RequestHeader(name ="type", required = true) String type, @RequestHeader(name ="year", required = true) String year) {
		return movieService.getOmdbMovieList(type, year);
	}
	
	@PostMapping(path = Constants.MOVIE_CREATE_URL, consumes = Constants.PRODUCES)
	public ResponseEntity<?> createMovie(@Valid @RequestBody MovieDetails movieDetails) {
		return movieService.createMovie(movieDetails);
	}
	
	@PutMapping(path = Constants.MOVIE_UPDATE_URL, consumes = Constants.PRODUCES)
	public ResponseEntity<?> updateMovie(@Valid @RequestBody MovieDetails movieDetails) {
		return movieService.updateMovie(movieDetails);
	}
	
}
