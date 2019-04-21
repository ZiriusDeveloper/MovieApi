package com.zirius.zerp.movies.service;

import com.zirius.zerp.movies.request.MovieRequest;
import com.zirius.zerp.movies.response.Response;

public interface MoviesService {

	Response getMovieByTitle(String title, String year);

	String getMovieByTitleFromOMDBAPI(String title, String year);

	Response saveMovie(MovieRequest movieReq);

	Response updateMovie(MovieRequest movieReq, long id);

}
