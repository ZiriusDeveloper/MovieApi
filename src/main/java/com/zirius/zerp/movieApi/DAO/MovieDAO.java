package com.zirius.zerp.movieApi.DAO;

import java.util.List;

import com.zirius.zerp.movieApi.Entities.Movie_Details;
import com.zirius.zerp.movieApi.Entities.ResponseBean;


public interface MovieDAO {
	
	public List<Movie_Details> getMovies(String Type);
	
	public List<ResponseBean> saveMovie(Movie_Details movie);
	
	public List<ResponseBean> updateMovie(Movie_Details movie);
	
	public Movie_Details getMovie(int id);
	
	public void deleteMovie(int id);
	
	
	public List<Movie_Details> searchMovies(String movieName,String Type,String Year);
	
	

}
