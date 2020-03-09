package com.zirius.zerp.movieApi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zirius.zerp.movieApi.payload.OMDbAPIResponse;
import com.zirius.zerp.movieApi.request.MovieDetailsRequest;
import com.zirius.zerp.movieApi.services.MovieDetailsServices;
import com.zirius.zerp.movieApi.util.RestUtil;

@RestController
@RequestMapping("/movie")
public class MovieDetails {
	
	@Autowired
	MovieDetailsServices MovieDetailsServices;
	
	 @PostMapping("/create")
	 public ResponseEntity<?> createMovie(@Valid @RequestBody MovieDetailsRequest movieDetailsRequest) throws JsonProcessingException {

	        return MovieDetailsServices.addMovie(movieDetailsRequest);
	 }
	 
	 @PutMapping("/update")
	 public ResponseEntity<?> updateMovie(@Valid @RequestBody MovieDetailsRequest movieDetailsRequest) throws JsonProcessingException {

	        return MovieDetailsServices.updateMovie(movieDetailsRequest);
	 }
	 
	 @GetMapping("/read")
	 public ResponseEntity<?> readMovie(@RequestHeader(name = "type", required = true) String type,
			 @RequestHeader(name = "year", required = true) String year) throws JsonProcessingException {

	        return MovieDetailsServices.readMovie(type,year);
	 }
	 
	 @GetMapping("/publicapi/read")
	 public ResponseEntity<?> publicApiReadMovie(@RequestHeader(name = "type", required = true) String type,
			 @RequestHeader(name = "year", required = true) String year) throws JsonProcessingException {
		 		RestTemplate restTemplate=new RestTemplate();
		 		return RestUtil.commonResponse(HttpStatus.OK, restTemplate.getForObject("http://www.omdbapi.com/?type="+type+"&y="+year+"&i=tt3896198&apikey=6612e496", OMDbAPIResponse.class),"");
	 }


}
