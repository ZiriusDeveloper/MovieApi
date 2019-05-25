package com.zirius.zerp.movieApi.service;

import com.zirius.zerp.movieApi.model.domain.Movie;
import com.zirius.zerp.movieApi.model.dto.MovieDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieApiService {

    /**
     * Returns list of movies based on th filter paramters
     *
     * @param title  title of the movie
     * @param type type of the movie
     * @param year year of the release
     * @param localdb fetch the content from local DB or remote
     * @return
     */
    public List<MovieDto>  getMovieInfo( String title,
                                String type,
                                Integer year,
                                boolean localdb) {

        return new ArrayList<>();

    }

    /**
     * save or update a new movie details into the db
     *
     * @param movie object
     * return id from the movie record
     */
    public  Integer saveMovie(Movie movie) {
        return -1;
    }


}
