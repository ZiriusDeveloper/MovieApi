package com.zirius.zerp.movieApi.Entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie_Rating {
	
	
	private String Source;
	
	private String Value;

	
	
	public Movie_Rating(String strRatingSource, String strRating) {
		super();
		this.Source = strRatingSource;
		this.Value = strRating;
	}

	public Movie_Rating()
	{
		
	}
	@JsonProperty(value = "Source")
	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}
	@JsonProperty(value = "Value")
	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}
	


	
	
}
