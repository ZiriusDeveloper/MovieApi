package com.zirius.zerp.movies.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class MovieRequest {
	
	@NotEmpty(message="Title mut not be blank")
	private String title;
	
	@NotEmpty(message="Year mut not be blank")
	@Size(min=4, max=4, message="Year must have 4 digits")
	private String year;
	
	@NotEmpty(message="Runtime mut not be blank")
	private String runtime;
	
	@NotEmpty (message="Genre mut not be blank")
	private String genre;
	
	@NotEmpty (message="Language mut not be blank")
	private String language;

	private Boolean isActive;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
