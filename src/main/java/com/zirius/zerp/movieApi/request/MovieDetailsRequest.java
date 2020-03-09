package com.zirius.zerp.movieApi.request;

import javax.validation.constraints.NotBlank;

public class MovieDetailsRequest {
	
	private int id;
	
	@NotBlank
	private String title;
    
	@NotBlank
	private String year;
	
	@NotBlank
	private String type;
    
    private String rated;
    
    private String runtime;
    
    private String genre;
    
    private String director;
    
    private String country;
    
    private String language;
    

	public MovieDetailsRequest(int id,String title, String year, String type, String rated, String runtime, String genre,
			String director, String country, String language) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.type = type;
		this.rated = rated;
		this.runtime = runtime;
		this.genre = genre;
		this.director = director;
		this.country = country;
		this.language = language;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getRated() {
		return rated;
	}


	public void setRated(String rated) {
		this.rated = rated;
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


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}
   

}
