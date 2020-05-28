package com.zirius.zerp.movieApi.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseBean {
	
	private String MovieId;
	private String Status;
	
	private String Description;

	
	public ResponseBean(String movieId, String status, String description) {
		super();
		MovieId = movieId;
		Status = status;
		Description = description;
	}
	
	public ResponseBean()
	{
		
	}
	
	@JsonProperty(value = "MovieId")
	public String getMovieId() {
		return MovieId;
	}

	public void setMovieId(String movieId) {
		MovieId = movieId;
	}

	@JsonProperty(value = "Status")
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	@JsonProperty(value = "Description")
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	

		
}
