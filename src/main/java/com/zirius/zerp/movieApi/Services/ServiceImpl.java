package com.zirius.zerp.movieApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.zirius.zerp.movieApi.DAO.MovieDAOImpl;
import com.zirius.zerp.movieApi.Entities.Movie_Details;
import com.zirius.zerp.movieApi.Entities.ResponseBean;

@org.springframework.stereotype.Service

public class ServiceImpl implements Service {

	@Autowired
	private MovieDAOImpl MovieDAOImpl;
	
	@Override
	@Transactional
	public List<Movie_Details> getMovieService(String strType) {
		return MovieDAOImpl.getMovies(strType);
	}

	@Override
	@Transactional
	public List<ResponseBean> saveMovie(Movie_Details movie) {
		return MovieDAOImpl.saveMovie(movie);
		
	}

	@Override
	@Transactional
	public Movie_Details getMovie(int id) {
		
		return MovieDAOImpl.getMovie(id);
	}

	@Override
	@Transactional
	public void deleteMovie(int id) {
		
		MovieDAOImpl.deleteMovie(id);
	}

	@Override
	@Transactional
	public List<Movie_Details> searchMovie(String query,String Type,String Year) {
		
		return MovieDAOImpl.searchMovies(query,Type,Year);
	}

	@Override
	@Transactional
	public List<ResponseBean> updateMovie(Movie_Details cust) {
		return MovieDAOImpl.updateMovie(cust);
	}



}
