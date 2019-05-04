package com.zirius.zerp.movieApi.handler;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import com.zirius.zerp.movieApi.entity.OnlineMovie;
import com.zirius.zerp.movieApi.entity.SearchOnlineMovie;

public class OnlineMovieHandler extends ApiStepHandler {

    String url = null;
    
    public OnlineMovieHandler() {
        this.url = null;
    }

    @Override
    public Object createRequest(Map<String, Object> inputs) throws UnsupportedEncodingException {

        StringBuilder url = new StringBuilder("http://www.omdbapi.com/?apikey=");
        url.append(URLEncoder.encode("603543c6","UTF-8"));
        url.append("&r=");
        url.append(URLEncoder.encode( "json" ,"UTF-8"));
        url.append("&type=");
        url.append(URLEncoder.encode( (String) inputs.get("type") ,"UTF-8"));
        url.append("&t=");
        url.append(URLEncoder.encode( (String) inputs.get("title") ,"UTF-8"));
        url.append("&year=");
        url.append(URLEncoder.encode( inputs.get("year").toString() ,"UTF-8"));

        this.url = url.toString() ;

        return true;
    }

    @Override
    public Object callService(Object request) throws Exception {

        if( this.url == null ){
            throw new Exception("Url is null");
        }

        String finalUrl = this.url ;		
		System.out.println("final url : " + finalUrl);
		
		URL url;
		url = new URL(finalUrl);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Accept", "application/json");
        
        int responseCode = con.getResponseCode();

        OnlineMovie onlineMovie = null ;

        if (responseCode != HttpURLConnection.HTTP_OK) { // not success
			String errorResponse = getResponse(con.getErrorStream());
			throw new Exception(errorResponse);
		} else {
			String response = getResponse(con.getInputStream());
			onlineMovie = (OnlineMovie)deserializeResponse(response, OnlineMovie.class);
        }
        
        return onlineMovie;
    }

    public static void main(String[] args) {
        OnlineMovieHandler onlineMovieHandler = new OnlineMovieHandler();

        Map<String,Object> inputs = new HashMap<String,Object>();
        inputs.put( "type" , "movie" ) ;
        inputs.put( "title" , "Game of Thrones" ) ;
        inputs.put( "page" , 5 ) ;

        try {
            onlineMovieHandler.createRequest(inputs);
            OnlineMovie onlineMovie = (OnlineMovie) onlineMovieHandler.callService(null);

            System.out.println(onlineMovieHandler.gson.toJson(onlineMovie));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}