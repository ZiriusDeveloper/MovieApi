package com.zirius.zerp.movieApi.entity;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SearchOnlineMovie {
    
    @SerializedName("Search") 
    List<OnlineMovie> searchedMovies ;

	@SerializedName("totalResults")
	private String totalResults;

	@SerializedName("Response")
	private String response;

	public List<OnlineMovie> getSearchedMovies() {
		return searchedMovies;
	}

	public void setSearchedMovies(List<OnlineMovie> searchedMovies) {
		this.searchedMovies = searchedMovies;
	}

	public String getTotalResults() {
		return totalResults;
	}
		
	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	
	public String getResponse() {
		return response;
	}
	
	public void setResponse(String response) {
		this.response = response;
	}

}