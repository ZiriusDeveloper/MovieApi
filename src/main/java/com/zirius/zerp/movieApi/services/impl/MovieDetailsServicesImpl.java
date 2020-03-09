package com.zirius.zerp.movieApi.services.impl;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zirius.zerp.movieApi.Model.MovieDetails;
import com.zirius.zerp.movieApi.repository.MovieDetailsRepository;
import com.zirius.zerp.movieApi.request.MovieDetailsRequest;
import com.zirius.zerp.movieApi.services.MovieDetailsServices;
import com.zirius.zerp.movieApi.util.RestUtil;

@Service
public class MovieDetailsServicesImpl implements MovieDetailsServices{
	
	  private static final Logger LOGGER = LoggerFactory.getLogger(MovieDetailsServicesImpl.class);
	
	@Autowired
	MovieDetailsRepository movieDetailsRepository;

	@Override
	public ResponseEntity<Object> addMovie(MovieDetailsRequest movieDetailsRequest) throws JsonProcessingException {
		Integer id = 0;
		try {
			MovieDetails movieDetails = new MovieDetails();
			BeanUtils.copyProperties(movieDetailsRequest, movieDetails);
			
			id = movieDetailsRepository.save(movieDetails).getId();
			
			return RestUtil.commonResponse(HttpStatus.OK, movieDetailsRepository.findById(id).get(),
					"Movie Details created");
		
		}catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			return RestUtil.commonWarning(HttpStatus.BAD_REQUEST, "Internal Server Error");
		}
		
	}

	@Override
	public ResponseEntity<Object> updateMovie(@Valid MovieDetailsRequest movieDetailsRequest) throws JsonProcessingException {
		Integer id = 0;
		try {
			MovieDetails movieDetails = new MovieDetails();
			BeanUtils.copyProperties(movieDetailsRequest, movieDetails);
			
			id = movieDetailsRepository.saveAndFlush(movieDetails).getId();
			
			return RestUtil.commonResponse(HttpStatus.OK, movieDetailsRepository.findById(id).get(),
					"Movie Details Created nor Updated");
		
		}catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			return RestUtil.commonWarning(HttpStatus.BAD_REQUEST, "Internal Server Error");
		}
	}

	@Override
	public ResponseEntity<?> readMovie(String type, String year) throws JsonProcessingException {
		try {
			
		
			return RestUtil.commonResponse(HttpStatus.OK, movieDetailsRepository.findByTypeaAndYear(type,year),"");
		
		}catch (Exception e) {
			LOGGER.error(e.getLocalizedMessage());
			return RestUtil.commonWarning(HttpStatus.BAD_REQUEST, "Internal Server Error");
		}
	}

	

}
