package com.zirius.zerp.movieApi.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.zirius.zerp.movieApi.entity.Movie;
import com.zirius.zerp.movieApi.entity.OnlineMovie;

public class MovieDB extends ConnectionFactory {

    public boolean addMovie(Movie movie) throws DBException {
        PreparedStatement preparedStatement = null;
        boolean toRet = false ;
        try {
            this.getConnection();

            String tableName = "Movie";
            String sqlstring = "INSERT INTO " + tableName
                    + " ( MOVIE_TITLE , MOVIE_YEAR , MOVIE_LANGUAGE , MOVIE_TYPE , CREATED_TIME , UPDATED_TIME ) ";
            sqlstring += " VALUES ( ? , ? , ? , ? , ? , ? )";

            Long currentTime = System.currentTimeMillis();
            preparedStatement = this.connection.prepareStatement(sqlstring);
            preparedStatement.setString(1, (String) movie.getTitle() );
            preparedStatement.setInt(2, (Integer) movie.getYear());
            preparedStatement.setString(3, (String) movie.getLanguage());
            preparedStatement.setString(4, (String) movie.getLanguage());
            preparedStatement.setLong(5, currentTime);
            preparedStatement.setLong(6, currentTime);

            System.out.println(preparedStatement);
            preparedStatement.execute();

            toRet = true ;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DBException(e.getMessage());
        } finally {
            try {
                if (null != preparedStatement) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                this.finalize();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return toRet ;
    }


    public boolean updateMovie(Movie movie){
        PreparedStatement preparedStatement = null;
        ResultSet resultset = null;
        boolean toRet = false ;
        try { 
            String tableName = "Movie" ;

            String sqlstring = "UPDATE " + tableName  ;

            Long currentTime = System.currentTimeMillis();
            sqlstring += " SET UPDATED_TIME = ? " ;

            if( movie.getTitle() != null ){
                sqlstring += " , MOVIE_TITLE = '" + movie.getTitle()  + "'" ;
            }
            if( movie.getYear() != null ){
                sqlstring += " , MOVIE_YEAR = " + movie.getYear() ;
            }
            if( movie.getType() != null ){
                sqlstring += " , MOVIE_TYPE = '" + movie.getType()   + "'" ;
            }
            if( movie.getLanguage() != null ){
                sqlstring += " , MOVIE_LANGUAGE = '" + movie.getLanguage() + "'" ;
            }

            sqlstring += " WHERE MOVIE_ID = ?" ;
            
            this.getConnection();
            preparedStatement = this.connection.prepareStatement(sqlstring);

            preparedStatement.setLong( 1 , currentTime);
            preparedStatement.setLong( 2 , movie.getId() );

            System.out.println(preparedStatement);
            preparedStatement.execute();

            toRet = true ;

        }catch (Exception e) {
            e.printStackTrace();
           new DBException(e.getMessage());
        }finally {
            try {
                if (null != preparedStatement) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                new DBException(e.getMessage());
            }
            try {
                this.finalize();
            } catch (Exception e) {
                e.printStackTrace();
                new DBException(e.getMessage());
            }
        }
        return toRet;
    }

    
    public OnlineMovie getMovieByTitle(String title , Integer year , String type) throws DBException{
        
        PreparedStatement preparedStatement = null;
        ResultSet resultset = null;
        OnlineMovie onlineMovie = null ;
        try {
        
            String tableName = "Movie" ;

            String sqlstring = "SELECT MOVIE_ID , MOVIE_TITLE , MOVIE_YEAR , MOVIE_LANGUAGE , MOVIE_TYPE FROM " + tableName  ;
            sqlstring += " WHERE MOVIE_TITLE LIKE '%"+ title + "%'";

            if( year != null ){
                sqlstring += " AND MOVIE_YEAR = " + year ;
            }

            if( type != null ){
                sqlstring += " AND MOVIE_TYPE = '"  + type + "'" ;
            }

            System.out.println(sqlstring);
            this.getConnection();
            preparedStatement = this.connection.prepareStatement(sqlstring);
            resultset = preparedStatement.executeQuery();

            if (resultset.next()) { 
                onlineMovie = new OnlineMovie() ;

                onlineMovie.setTitle( resultset.getString("MOVIE_TITLE") ) ;
                onlineMovie.setYear( resultset.getInt("MOVIE_YEAR") + "" );
                onlineMovie.setLanguage(resultset.getString("MOVIE_LANGUAGE"));
                onlineMovie.setType( resultset.getString("MOVIE_TYPE") );
            }

        } catch (Exception e) {
            e.printStackTrace();
           new DBException(e.getMessage());
        }finally {
            try {
                if (null != preparedStatement) {
                    preparedStatement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                new DBException(e.getMessage());
            }
            try {
                this.finalize();
            } catch (Exception e) {
                e.printStackTrace();
                new DBException(e.getMessage());
            }
        }

        return onlineMovie ;
    }

}