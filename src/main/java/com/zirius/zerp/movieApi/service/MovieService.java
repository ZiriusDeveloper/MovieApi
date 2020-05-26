package com.zirius.zerp.movieApi.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zirius.zerp.movieApi.bean.MovieList;
import com.zirius.zerp.movieApi.entity.MovieDetails;

@Service
public interface MovieService {
	
	List<MovieDetails> getMovies();
 
	ResponseEntity<?> createMovie(MovieDetails movieDetails);

	ResponseEntity<?> updateMovie(MovieDetails movieDetails);
 	
	MovieList getOmdblist(String title);
 	
 	ResponseEntity<?> getMovieList(String type, String year);
 	
 	ResponseEntity<?> getOmdbMovieList(String type, String year);
 	
}
