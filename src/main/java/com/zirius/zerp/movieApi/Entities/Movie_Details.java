package com.zirius.zerp.movieApi.Entities;

import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@Entity
@Table(name="Movie_Details",uniqueConstraints = {
		@UniqueConstraint(columnNames = "id")})
@JsonRootName("Messages")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie_Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	
	
	private int id;
	
	@NotNull(message = "Title is mandatory")
	@NotEmpty(message = "Title is mandatory")
	
	private String Title;
	
	@NotNull(message = "Year is mandatory")
	@NotEmpty(message = "Year is mandatory")
	private String Year;
	
	@NotNull(message = "Rate is mandatory")
	@NotEmpty(message = "Rated is mandatory")
	private String Rated;
	
	@NotNull(message = "Release is mandatory")
	@NotEmpty(message = "Release is mandatory")
	
	private String Released;
	
	@NotNull(message = "Runtime is mandatory")
	@NotEmpty(message = "Runtime is mandatory")
	
	private String Runtime;
	
	@NotNull(message = "Genre is mandatory")
	@NotEmpty(message = "Genre is mandatory")
	
	private String Genre;
	
	@NotNull(message = "Director is mandatory")
	@NotEmpty(message = "Director is mandatory")
	
	private String Director;
	
	@NotNull(message = "Writer is mandatory")
	@NotEmpty(message = "Writer is mandatory")
	
	private String Writer;
	
	@NotNull(message = "Actors is mandatory")
	@NotEmpty(message = "Actors is mandatory")
	
	private String Actors;
	
	@NotNull(message = "Plot is mandatory")
	@NotEmpty(message = "Plot is mandatory")
	
	private String Plot;
	
	@NotNull(message = "Language is mandatory")
	@NotEmpty(message = "Language is mandatory")
	
	private String Language;
	
	@NotNull(message = "Country is mandatory")
	private String Country;
	
	@NotNull(message = "Awards is mandatory")
	private String Awards;
	
	@NotNull(message = "Poster is mandatory")
	private String Poster;
	@Embedded
    private Set<Movie_Rating> strRatings;
    
    @NotNull(message = "Metascore is mandatory")
	private String Metascore;
    
    @NotNull(message = "IMDBRating is mandatory")
	private String imdbRating;
    
    @NotNull(message = "IMDBVotes is mandatory")
	private String imdbVotes;
    
    @NotNull(message = "IMDB is mandatory")
	private String imdbID;
    
    @NotNull(message = "Type is mandatory")
	private String Type;
    
    @NotNull(message = "DVD is mandatory")
	private String DVD;
    
    @NotNull(message = "BoxOffice is mandatory")
	private String BoxOffice;
    
    @NotNull(message = "Production is mandatory")
	private String Production;
    
    @NotNull(message = "Website is mandatory")
	private String Website;
    
	private String Response;
	
	public Movie_Details(String title, String year, String rated, String released, String runtime, String genre,
			String director, String writer, String actors, String plot, String language, String country, String awards,
			String poster, Set<Movie_Rating> strRatings, String metascore, String imdbRating, String imdbVotes,
			String imdbID, String type, String dVD, String boxOffice, String production, String website,
			String response) {
		super();
		Title = title;
		Year = year;
		Rated = rated;
		Released = released;
		Runtime = runtime;
		Genre = genre;
		Director = director;
		Writer = writer;
		Actors = actors;
		Plot = plot;
		Language = language;
		Country = country;
		Awards = awards;
		Poster = poster;
		this.strRatings = strRatings;
		Metascore = metascore;
		this.imdbRating = imdbRating;
		this.imdbVotes = imdbVotes;
		this.imdbID = imdbID;
		Type = type;
		DVD = dVD;
		BoxOffice = boxOffice;
		Production = production;
		Website = website;
		Response = response;
	}

	public Movie_Details()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@JsonProperty(value = "Title")
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
	@JsonProperty(value = "Year")
	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}
	@JsonProperty(value = "Rated")
	public String getRated() {
		return Rated;
	}

	public void setRated(String rated) {
		Rated = rated;
	}
	@JsonProperty(value = "Released")
	public String getReleased() {
		return Released;
	}

	public void setReleased(String released) {
		Released = released;
	}
	@JsonProperty(value = "Runtime")
	public String getRuntime() {
		return Runtime;
	}

	public void setRuntime(String runtime) {
		Runtime = runtime;
	}
	@JsonProperty(value = "Genre")
	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}
	@JsonProperty(value = "Director")
	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}
	@JsonProperty(value = "Writer")
	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}
	@JsonProperty(value = "Actors")
	public String getActors() {
		return Actors;
	}

	public void setActors(String actors) {
		Actors = actors;
	}
	@JsonProperty(value = "Plot")
	public String getPlot() {
		return Plot;
	}

	public void setPlot(String plot) {
		Plot = plot;
	}
	@JsonProperty(value = "Language")
	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}
	@JsonProperty(value = "Country")
	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	@JsonProperty(value = "Awards")
	public String getAwards() {
		return Awards;
	}

	public void setAwards(String awards) {
		Awards = awards;
	}
	@JsonProperty(value = "Poster")
	public String getPoster() {
		return Poster;
	}

	public void setPoster(String poster) {
		Poster = poster;
	}
	@JsonProperty(value = "Ratings")
	public Set<Movie_Rating> getStrRatings() {
		return strRatings;
	}

	public void setStrRatings(Set<Movie_Rating> strRatings) {
		this.strRatings = strRatings;
	}
	@JsonProperty(value = "Metascore")
	public String getMetascore() {
		return Metascore;
	}

	public void setMetascore(String metascore) {
		Metascore = metascore;
	}
	@JsonProperty(value = "imdbRating")
	public String getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	@JsonProperty(value = "imdbVotes")
	public String getImdbVotes() {
		return imdbVotes;
	}

	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	@JsonProperty(value = "imdbID")
	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	@JsonProperty(value = "Type")
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	@JsonProperty(value = "DVD")
	public String getDVD() {
		return DVD;
	}

	public void setDVD(String dVD) {
		DVD = dVD;
	}
	@JsonProperty(value = "BoxOffice")
	public String getBoxOffice() {
		return BoxOffice;
	}

	public void setBoxOffice(String boxOffice) {
		BoxOffice = boxOffice;
	}
	@JsonProperty(value = "Production")
	public String getProduction() {
		return Production;
	}

	public void setProduction(String production) {
		Production = production;
	}
	@JsonProperty(value = "Website")
	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}
	@JsonProperty(value = "Response")
	public String getResponse() {
		return Response;
	}
	
	public void setResponse(String response) {
		Response = response;
	}
    
	
	
    

	
	
	

}
