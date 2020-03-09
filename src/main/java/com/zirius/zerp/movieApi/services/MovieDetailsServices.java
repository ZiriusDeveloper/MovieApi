package com.zirius.zerp.movieApi.services;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zirius.zerp.movieApi.request.MovieDetailsRequest;

public interface MovieDetailsServices {

	public ResponseEntity<Object> addMovie(MovieDetailsRequest movieDetailsRequest) throws JsonProcessingException ;

	public ResponseEntity<?> updateMovie(@Valid MovieDetailsRequest movieDetailsRequest) throws JsonProcessingException;

	public ResponseEntity<?> readMovie(String type, String year) throws JsonProcessingException;
}
