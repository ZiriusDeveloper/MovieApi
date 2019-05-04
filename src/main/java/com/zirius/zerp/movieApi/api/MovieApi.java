package com.zirius.zerp.movieApi.api;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.zirius.zerp.movieApi.entity.Movie;
import com.zirius.zerp.movieApi.entity.Movie;
import com.zirius.zerp.movieApi.entity.OnlineMovie;
import com.zirius.zerp.movieApi.service.MovieService;

@Path("/movie")
public class MovieApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseData getMovie( @QueryParam("title") String title , @HeaderParam("year") int year ,  @HeaderParam("type") String type ){
        
        ResponseData responseData = new ResponseData() ;
        try {
            MovieService movieService =  new MovieService() ;

            OnlineMovie onlineMovie = movieService.getMoviesFromMovieDB(title, year, type) ;

            responseData.setResponseCode( 200 );
            responseData.setData(onlineMovie);

        } catch (Exception e) {
            responseData.setInternalError();
        }

        return responseData ;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/online")
    public ResponseData getMovieFromOmdbApi( @QueryParam("title") String title , @HeaderParam("year") int year ,  @HeaderParam("type") String type ){
        
        ResponseData responseData = new ResponseData() ;
        try {
            MovieService movieService =  new MovieService() ;

            OnlineMovie onlineMovie = movieService.getMoviesFromOmdbApi(title, year, type) ;

            responseData.setResponseCode( 200 );
            responseData.setData(onlineMovie);
            
        } catch (Exception e) {
            responseData.setInternalError();
        }

        return responseData ;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseData addMovieToDB( @HeaderParam("request") String request ){
        
        ResponseData responseData = new ResponseData() ;
        try {
            MovieService movieService =  new MovieService() ;

            Gson gson = new Gson() ;
            Movie movie = gson.fromJson( request , Movie.class ) ;
            
            if( movieService.addMovieToDB( movie) ){
                responseData.setResponseCode( 201  );
                responseData.setData(movie.getTitle() + " is added " );
            }else{
               throw new Exception("Not added") ;
            }
           
        } catch (Exception e) {
            responseData.setInternalError();
        }

        return responseData ;
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public ResponseData updateMovieToDB( @HeaderParam("request") String request , @PathParam("id") Long id ){
        
        ResponseData responseData = new ResponseData() ;
        try {
            MovieService movieService =  new MovieService() ;

            Gson gson = new Gson() ;
            Movie movie = gson.fromJson( request , Movie.class ) ;
            movie.setId(id);
            
            if( movieService.updateMovieToDB(movie) ){
                responseData.setResponseCode( 202   );
                responseData.setData(movie.getTitle() + " is added " );
            }else{
                throw new Exception("Not added") ;
            }
           
        }catch(Exception e) {
            responseData.setInternalError();
        }
        return responseData ;
    }
}