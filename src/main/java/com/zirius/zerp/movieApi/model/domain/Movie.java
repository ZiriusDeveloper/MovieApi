package com.zirius.zerp.movieApi.model.domain;

import com.zirius.zerp.tables.pojos.*;

import java.util.List;
import java.time.LocalDate;

public class Movie {

    private Integer   id;
    private String    title;
    private Integer   year;
    private String    rated;
    private LocalDate released;
    private String    runtime;
//    private List<Genres>    genre;
//    private List<Directors> director;
//    private List<Writers>   writer;
    private Integer      languageId;
    private String       language;
    private Integer      countryId;
    private String country;
//    private List<MovieAwards> awards;
//    private List<MovieRatings> ratings;
    private Long      metascore;
    private Long      votes;
    private String      type;
    private LocalDate dvdReleaseDate;
    private String    website;
//    private List<Actors>    actor;
    private String    plot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

//    public List<Genres> getGenre() {
//        return genre;
//    }
//
//    public void setGenre(List<Genres> genre) {
//        this.genre = genre;
//    }
//
//    public List<Directors> getDirector() {
//        return director;
//    }
//
//    public void setDirector(List<Directors> director) {
//        this.director = director;
//    }
//
//    public List<Writers> getWriter() {
//        return writer;
//    }
//
//    public void setWriter(List<Writers> writer) {
//        this.writer = writer;
//    }

//    public List<Actors> getActor() {
//        return actor;
//    }
//
//    public void setActor(List<Actors> actor) {
//        this.actor = actor;
//    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public List<MovieAwards> getAwards() {
//        return awards;
//    }
//
//    public void setAwards(List<MovieAwards> awards) {
//        this.awards = awards;
//    }
//
//    public List<MovieRatings> getRatings() {
//        return ratings;
//    }
//
//    public void setRatings(List<MovieRatings> ratings) {
//        this.ratings = ratings;
//    }

    public Long getMetascore() {
        return metascore;
    }

    public void setMetascore(Long metascore) {
        this.metascore = metascore;
    }

    public Long getVotes() {
        return votes;
    }

    public void setVotes(Long votes) {
        this.votes = votes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDvdReleaseDate() {
        return dvdReleaseDate;
    }

    public void setDvdReleaseDate(LocalDate dvdReleaseDate) {
        this.dvdReleaseDate = dvdReleaseDate;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

}
