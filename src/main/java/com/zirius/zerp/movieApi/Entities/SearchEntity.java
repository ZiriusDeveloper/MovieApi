package com.zirius.zerp.movieApi.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class SearchEntity {
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String MovieName;
    @NotEmpty(message = "Type is mandatory")
    @NotNull(message = "Type is mandatory")
    private String Type;
    @NotEmpty(message = "Year of Release is mandatory")
    @NotNull(message = "Year of Release is mandatory")
    private String Year;
     
    public SearchEntity()
    {
    	
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}
    
    
    
         
}
