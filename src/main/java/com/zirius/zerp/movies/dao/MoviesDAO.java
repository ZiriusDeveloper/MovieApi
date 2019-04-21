package com.zirius.zerp.movies.dao;

import com.zirius.zerp.movies.model.Movie;

public interface MoviesDAO {

	Movie getMovieByTitle(String title, String year);

	Boolean isMovieAlreadyPresent(String title, String year, String language);

	void saveMovie(Movie movie);

	Movie findById(long id);

}
