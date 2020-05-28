package com.zirius.zerp.movieApi.Services;

import java.util.List;

import com.zirius.zerp.movieApi.Entities.Movie_Details;
import com.zirius.zerp.movieApi.Entities.ResponseBean;

public interface Service {
	
	public List<Movie_Details> getMovieService(String strType);
	
	public List<ResponseBean> saveMovie(Movie_Details cust);
	
	public List<ResponseBean> updateMovie(Movie_Details cust);
	
	public Movie_Details getMovie(int id);
	
	public void deleteMovie(int id);
	
	public List<Movie_Details> searchMovie(String MovieName,String Type,String Year);

}
