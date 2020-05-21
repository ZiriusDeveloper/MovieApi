package com.zirius.zerp.movieApi;

import org.springframework.web.client.RestTemplate;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping(value = "/")
public class Controller {

	@Autowired
	private ServiceClass service;
	//To retrieve all data in database
	@GetMapping("/getmov")
	public List<Model> getMovies(){
		return service.getMovies();
	}
	//To save the new data
	@PostMapping("/create")
	public String create(@RequestBody Model model) {
		return service.create(model); 
	}
//To update the existing record
	@PostMapping("/update")
	public String update(@RequestBody Model model) {
		return service.update(model);
	}
	//Public api call
	@RequestMapping(value="/omdbapi/get", method=RequestMethod.GET)
	public OMDBDetail omdbDetails(@RequestHeader(name = "type", required = true) String type,
			 @RequestHeader(name = "year", required = true) String year) {
		OMDBDetail omdbDeatil=new OMDBDetail();
		RestTemplate restTemplate=new RestTemplate();
		omdbDeatil=restTemplate.getForObject("http://www.omdbapi.com?type="+type+"&y="+year+"&i=tt3896198&apikey=6612e496", OMDBDetail.class);
		return omdbDeatil;
	}
}