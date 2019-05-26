package com.zirius.zerp.movieApi.util;

import com.zirius.zerp.movieApi.model.domain.Movie;
import com.zirius.zerp.tables.pojos.*;

public class DomainPOJOMapper {

    public static Movies mapToMoviesPOJO(Movie movie) {

        Movies movies = new Movies();

        movies.setId(movie.getId());
        movies.setTitle(movie.getTitle());
        movies.setYear(movie.getYear());
        movies.setRated(movie.getRated());
        movies.setReleased(movie.getReleased());
        movies.setRuntime(movie.getRuntime());
        movies.setPlot(movie.getPlot());
        movies.setLanguage(movie.getLanguageId());
        movies.setCountry(movie.getCountryId());
        movies.setMetascore(movie.getMetascore());
        movies.setVotes(movie.getVotes());
        movies.setType(movie.getType());
        movies.setDvdReleaseDate(movie.getDvdReleaseDate());
        movies.setWebsite(movie.getWebsite());

        return movies;
    }

    public static MovieGenres mapToMovieGenres(Integer movieId, Genres genres) {
        MovieGenres movieGenres = new MovieGenres();
        movieGenres.setMovieId(movieId);
        movieGenres.setGenreId(genres.getId());
        return movieGenres;
    }

    public static MovieDirectors mapToMovieDirectors(Integer movieId, Directors directors) {
        MovieDirectors movieDirectors = new MovieDirectors();
        movieDirectors.setMovieId(movieId);
        movieDirectors.setDirectorId(directors.getId());
        return movieDirectors;
    }

    public static MovieWriters mapToMovieWriters(Integer movieId, Writers writers) {
        MovieWriters movieWriters = new MovieWriters();
        movieWriters.setMovieId(movieId);
        movieWriters.setWriterId(writers.getId());
        return movieWriters;
    }

    public static MovieActors mapToMovieActors(Integer movieId, Actors actors) {
        MovieActors movieActors = new MovieActors();
        movieActors.setMovieId(movieId);
        movieActors.setActorId(actors.getId());
        return movieActors;
    }

}
