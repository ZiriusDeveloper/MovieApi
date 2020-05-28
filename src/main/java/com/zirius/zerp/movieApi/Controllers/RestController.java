package com.zirius.zerp.movieApi.Controllers;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zirius.zerp.movieApi.Entities.CustomException;
import com.zirius.zerp.movieApi.Entities.Movie_Details;
import com.zirius.zerp.movieApi.Entities.ResponseBean;
import com.zirius.zerp.movieApi.Entities.SearchEntity;
import com.zirius.zerp.movieApi.Services.ServiceImpl;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	private Client client;
	private WebTarget target;
	
	@Autowired
	private ServiceImpl service;
	
	
	
	
	@PostMapping("/insertMovieDetails")
	public List<ResponseBean> postMovieDetails(@Valid @ModelAttribute("movie_details") Movie_Details movieDetails, BindingResult bindingResult)
	{
//		System.out.println("Into postMovieDetails"+movieDetails.getTitle());
		List<ResponseBean> test =service.saveMovie(movieDetails);
		System.out.println(test.size());
		
		return test;
		
	}
	
	@RequestMapping("/searchMainMovie")
	public List<Movie_Details> getMovieDetails(@Valid @ModelAttribute("SearchLogin") SearchEntity search, BindingResult bindingResult)
	{
		System.out.println("Into searchMainMovie");
		List<Movie_Details> test =service.searchMovie(search.getMovieName(),search.getType(),search.getYear());
		
		client = ClientBuilder.newClient();
	    Response target = client.target("http://www.omdbapi.com/")
	       .queryParam("i", "tt3896198")
	       .queryParam("apikey", "816ded3a")
	       .queryParam("type", search.getType())
	       .queryParam("y", search.getYear()).request().get();
		Movie_Details test1 = target.readEntity(Movie_Details.class);
		if(test1.getTitle()!="")
		{
			List<ResponseBean> strOnlineData =service.saveMovie(test1);
			test.add(test1);
		}
		target.close();
	    client.close();
	      
		return test;
		
	}
	
	
	
	@GetMapping("/List/{Type}")
	public List<Movie_Details> getMovieList(@PathVariable(name = "Type") String strType)
	{
			List<Movie_Details> test=service.getMovieService(strType);
			System.out.println("***********"+test.size());
			
			return test;
	}
		
	
	
	
//	@PostMapping("/updateMovieDetails")
//	public List<ResponseBean> updateMovieDetails(@Valid @ModelAttribute("movie_details") Movie_Details movieDetails, BindingResult bindingResult)
//	{
//		if(bindingResult.hasErrors())
//		{
//			throw new CustomException(
//			          "Wrong passcode",
//			          "You've entered an incorrect passcode, try again with correct one",
//			          "Orange, juicy and sweet"
//			          );
//		}
//		else {
//			List<ResponseBean> test =service.updateMovie(movieDetails);
//			System.out.println(test.size());
//			return test;
//		}
//		
//		
//		
//		
//	}
	
}
