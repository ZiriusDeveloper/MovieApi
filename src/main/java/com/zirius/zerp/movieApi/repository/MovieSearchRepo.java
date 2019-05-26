package com.zirius.zerp.movieApi.repository;

import com.zirius.zerp.Tables;
import static com.zirius.zerp.Tables.*;
import com.zirius.zerp.movieApi.model.domain.Movie;
import com.zirius.zerp.tables.pojos.Actors;
import com.zirius.zerp.tables.pojos.Directors;
import com.zirius.zerp.tables.pojos.Genres;
import com.zirius.zerp.tables.pojos.Writers;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieSearchRepo {

    @Autowired
    DSLContext jooq;

    public List<Movie> search(String title,
                              String type,
                              Integer year) {

        List<Condition> conditions = new ArrayList<>();

        if(!StringUtils.isEmpty(title)) {
            conditions.add(MOVIES.TITLE.eq(title));
        }

        if(!StringUtils.isEmpty(type)) {
            conditions.add(MOVIES.TYPE.eq(type));
        }

        if(year != null) {
            conditions.add(MOVIES.YEAR.eq(year));
        }


        List<Movie> movies = jooq.select(MOVIES.ID,
                                            MOVIES.TITLE,
                                            MOVIES.YEAR,
                                            MOVIES.RATED,
                                            MOVIES.RELEASED,
                                            MOVIES.PLOT,
                                            WORLD_LANGUAGES.ID.as("languageId"),
                                            WORLD_LANGUAGES.NAME.as("language"),
                                            WORLD_COUNTRIES.ID.as("countryId"),
                                            WORLD_COUNTRIES.NAME.as("country"),
                                            MOVIES.METASCORE,
                                            MOVIES.VOTES,
                                            MOVIES.TYPE,
                                            MOVIES.DVD_RELEASE_DATE.as("dvd"),
                                            MOVIES.WEBSITE )
                                            .from(MOVIES)
                                            .leftJoin(Tables.WORLD_LANGUAGES)
                                            .on(MOVIES.LANGUAGE.eq(WORLD_LANGUAGES.ID))
                                            .leftJoin(WORLD_COUNTRIES)
                                            .on(MOVIES.COUNTRY.eq(WORLD_COUNTRIES.ID))
                                                             .where(conditions)
                                 .fetchInto(Movie.class);

//        addGenres(movies);
//        addDirectors(movies);
//        addWriter(movies);
//        addActors(movies);

        return movies;
    }

//    private void addGenres(List<Movie> movies) {
//
//        movies
//                .stream()
//                .forEach(movie->{
//
//                    movie.setGenre(jooq.select(GENRES.ID,GENRES.DESCRIBED)
//                            .from(MOVIE_GENRES)
//                            .leftJoin(GENRES)
//                            .on(MOVIE_GENRES.GENRE_ID.eq(GENRES.ID))
//                            .where(MOVIE_GENRES.MOVIE_ID.eq(movie.getId()))
//                            .fetchInto(Genres.class));
//
//                });
//
//    }
//
//    private void addDirectors(List<Movie> movies) {
//
//        movies
//                .stream()
//                .forEach(movie->{
//
//                    movie.setDirector(jooq.select(DIRECTORS.ID,DIRECTORS.NAME)
//                            .from(MOVIE_DIRECTORS)
//                            .leftJoin(DIRECTORS)
//                            .on(MOVIE_DIRECTORS.DIRECTOR_ID.eq(DIRECTORS.ID))
//                            .where(MOVIE_DIRECTORS.MOVIE_ID.eq(movie.getId()))
//                            .fetchInto(Directors.class));
//
//                });
//
//    }
//
//    private void addWriter(List<Movie> movies) {
//
//        movies
//                .stream()
//                .forEach(movie->{
//
//                    movie.setWriter(jooq.select(WRITERS.ID,WRITERS.NAME)
//                            .from(MOVIE_WRITERS)
//                            .leftJoin(WRITERS)
//                            .on(MOVIE_WRITERS.WRITER_ID.eq(WRITERS.ID))
//                            .where(MOVIE_WRITERS.MOVIE_ID.eq(movie.getId()))
//                            .fetchInto(Writers.class));
//
//                });
//
//    }
//
//    private void addActors(List<Movie> movies) {
//
//        movies
//                .stream()
//                .forEach(movie->{
//
//                    movie.setActor(jooq.select(ACTORS.ID,ACTORS.NAME)
//                            .from(MOVIE_ACTORS)
//                            .leftJoin(ACTORS)
//                            .on(MOVIE_ACTORS.ACTOR_ID.eq(ACTORS.ID))
//                            .where(MOVIE_ACTORS.MOVIE_ID.eq(movie.getId()))
//                            .fetchInto(Actors.class));
//
//                });
//
//    }

}