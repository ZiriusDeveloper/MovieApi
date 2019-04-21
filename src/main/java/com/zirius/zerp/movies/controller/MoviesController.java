package com.zirius.zerp.movies.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zirius.zerp.movies.request.MovieRequest;
import com.zirius.zerp.movies.response.Response;
import com.zirius.zerp.movies.service.MoviesService;

@RestController
@RequestMapping(path = "/movie")
public class MoviesController {

	public static final Logger LOGGER = LoggerFactory.getLogger(MoviesController.class);

	@Autowired
	MoviesService moviesService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> getMovieByTitle(@RequestParam("title") String title,
			@RequestHeader(name = "YEAR", required = false) String year) {
		LOGGER.debug(">> getMovieByTitle() for title", title, year);
		Response response = new Response();
		try {
			response = moviesService.getMovieByTitle(title, year);
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage());
			response.setMessage(ex.getMessage());
			return new ResponseEntity<Response>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}

	@GetMapping(value = "/omdbapi/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getMovieByTitleFromOMDBAPI(@PathVariable("title") String title,
			@RequestHeader(name = "YEAR", required = false) String year) {
		LOGGER.debug(">> getMovieByTitleFromOMDBAPI() for title", title);
		String response = null;
		try {
		response = moviesService.getMovieByTitleFromOMDBAPI(title.toLowerCase(), year);
		}catch (Exception ex) {
			LOGGER.error(ex.getMessage());
		}
		return response;
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> addMovie(@Valid @RequestBody MovieRequest movieReq) throws Exception {
		LOGGER.debug(">> addMovie() ", movieReq.toString());
		Response response = new Response();
		try {
			response = moviesService.saveMovie(movieReq);

		} catch (Exception ex) {
			LOGGER.error(ex.getMessage());
			response.setMessage(ex.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> updateMovie(@RequestBody MovieRequest movieReq, @PathVariable @Min(1) long id) {

		LOGGER.debug(">> updateMovie() for id ", id);
		Response response = new Response();
		try {
			response = moviesService.updateMovie(movieReq, id);
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage());
			response.setMessage(ex.getMessage());
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
