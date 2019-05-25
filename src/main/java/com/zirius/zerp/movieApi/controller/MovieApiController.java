package com.zirius.zerp.movieApi.controller;

import com.zirius.zerp.movieApi.model.domain.Movie;
import com.zirius.zerp.movieApi.model.dto.MovieDto;
import com.zirius.zerp.movieApi.service.MovieApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
public class MovieApiController {

    @Autowired
    private MovieApiService movieApiService;

    /**
     * This getter collects the information from our locally stored database.
     *
     * @param type type of the content such as movie , series
     * @param year year of the release
     *
     * @return list of movies wrapped in response object
     */
    @GetMapping("/localdb")
    public ResponseEntity<List<MovieDto>> getFromLocalDB(@RequestHeader(name = "type", required = true) String type,
                                                    @RequestHeader(name = "year", required = true) Integer year) {
        return new ResponseEntity<>(movieApiService.getMovieInfo("", type, year, true), HttpStatus.OK);
    }

    /**
     * This getter gather information from an online db of movies called OMDB
     *
     * @param movieTitle
     * @param type
     * @param year
     * @return
     */
    @GetMapping("/omdb")
    public ResponseEntity<List<MovieDto>> getFromOMDB(@RequestHeader(name = "title", required = true) String movieTitle,
                                                      @RequestHeader(name = "type", required = true) String type,
                                                      @RequestHeader(name = "year", required = true) Integer year) {
        return new ResponseEntity<>(movieApiService.getMovieInfo("", type, year, true), HttpStatus.OK);
    }

    /**
     * Add a movie information into out local database for movies
     *
     * @param movie object
     * @return response entity with the information of created movie and status of the operation
     */
    @PostMapping("/localdb/add")
    public ResponseEntity<Void> addMovieInformation( @RequestHeader(name = "movie" , required = true) Movie movie) {
        return null;
    }

    /**
     * Update an existing movie in our local movie database.
     *
     * @param movie object for update
     * @return response entity with the status of the operation
     */
    @PostMapping("/localdb/update")
    public ResponseEntity<Void> updateMovieInformation( @RequestHeader(name = "movie", required = true) Movie movie) {
        return null;
    }

}
