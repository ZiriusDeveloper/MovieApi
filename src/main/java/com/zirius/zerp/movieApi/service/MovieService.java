package com.zirius.zerp.movieApi.service;

import java.util.HashMap;
import java.util.Map;

import com.zirius.zerp.movieApi.db.DBException;
import com.zirius.zerp.movieApi.db.MovieDB;
import com.zirius.zerp.movieApi.entity.Movie;
import com.zirius.zerp.movieApi.entity.OnlineMovie;
import com.zirius.zerp.movieApi.handler.OnlineMovieHandler;

public class MovieService {

    public OnlineMovie getMoviesFromMovieDB( String title , int year , String type){

        OnlineMovie onlineMovie = null ;
        try {
            MovieDB movieDB =  new MovieDB();
            onlineMovie = movieDB.getMovieByTitle(title, year , type ) ;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return onlineMovie ;
    }

    public OnlineMovie getMoviesFromOmdbApi( String title , int year , String type){
        OnlineMovieHandler onlineMovieHandler = new OnlineMovieHandler();

        OnlineMovie onlineMovie = null ;
        Map<String,Object> inputs = new HashMap<String,Object>();
        inputs.put( "type" , type  ) ;
        inputs.put( "title" , title  ) ;
        inputs.put( "year" , year ) ;

        try {
            onlineMovieHandler.createRequest(inputs);
            onlineMovie = (OnlineMovie) onlineMovieHandler.callService(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return onlineMovie ;
    }

    public boolean addMovieToDB( Movie movie){
        MovieDB movieDB =  new MovieDB();
        boolean toRet = false ;
        try {
			toRet =  movieDB.addMovie(movie) ;
		} catch (DBException e) {
			e.printStackTrace();
        }
        return toRet ;
    }

    public boolean updateMovieToDB( Movie movie){
        MovieDB movieDB =  new MovieDB();
        boolean toRet = false ;
        try {
			toRet =  movieDB.addMovie(movie) ;
		} catch (DBException e) {
			e.printStackTrace();
        }
        return toRet ;
    }

}