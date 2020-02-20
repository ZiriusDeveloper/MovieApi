package com.zirius.zerp.movieApi.dao;

import java.util.List;

public class MovieDetailResponse {
	
	List<MovieDetails> movieList;

	public List<MovieDetails> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<MovieDetails> movieList) {
		this.movieList = movieList;
	}
	
}
