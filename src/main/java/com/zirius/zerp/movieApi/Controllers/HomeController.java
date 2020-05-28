package com.zirius.zerp.movieApi.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zirius.zerp.movieApi.Entities.CustomException;
import com.zirius.zerp.movieApi.Entities.Movie_Details;
import com.zirius.zerp.movieApi.Entities.ResponseBean;
import com.zirius.zerp.movieApi.Entities.SearchEntity;
import com.zirius.zerp.movieApi.Services.ServiceImpl;

@Controller

public class HomeController {
		
	@Autowired
	private ServiceImpl service;
	
	@GetMapping("/")
	public String getHomePage(Model model)
	{
		model.addAttribute("SearchLogin", new SearchEntity()); 
		return "Login";
	}
	
	@RequestMapping("/AuthenticateLoginPage")
	public String getAuthenticatePage()
	{
		return "AuthenticateLoginPage";
	}
	
	@GetMapping("/access-denied")
	public String getErrorPage()
	{
		return "ErrorMessagePage";
	}
	
	@GetMapping("/logout")
	public String getLogoutPage()
	{
		return "AuthenticateLoginPage";
	}
	
	@RequestMapping("/adminLogin")
	public String getAdminLogin()
	{
		return "AdminLoginPage";
	}
	
	@RequestMapping("/insertNewEntries")
	public String getAdminNewEntryPage(Model model)
	{
		model.addAttribute("movie_details", new Movie_Details());
		
		return "AddRecords";
	}
	
	@RequestMapping("/updateEntries")
	public String getAdminUpdateEntryPage(Model model)
	{
		model.addAttribute("movie_details", new Movie_Details());
		
		return "UpdateRecords";
	}
	
	@RequestMapping("/FetchDetails")
	public String fetchMovieDetails(@RequestParam("Id") int id,Model movie_details)
	{
		Movie_Details md=service.getMovie(id);
		movie_details.addAttribute("movie_details", md);
		return "UpdateRecords";
		
	}
	@PostMapping("/updateMovieDetails")
	public String updateMovieDetails(@Valid @ModelAttribute("movie_details") Movie_Details movieDetails, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			return "UpdateRecords";
		}
		else {
			
			List<ResponseBean> test =service.updateMovie(movieDetails);
			System.out.println(test.size());
			for(ResponseBean t:test)
			{
				System.out.println(t.getStatus());
				if(t.getStatus().contains("200") || t.getStatus().contains("202"))
				{
//					 "Data Updated SuccessFully";
					throw new CustomException(
							t.getStatus(),
					          t.getDescription(),
					          "Check Entered Movie ID"
					          );
				}
				else {
							throw new CustomException(
									t.getStatus(),
							          t.getDescription(),
							          "Check Entered Movie ID"
							          );
				}
			}
		}
		
		return "";
		
		
	}
//	@GetMapping("/MovieDesc/{MovieName}")
//	public String getMovieDesc(@PathVariable("MovieName") String strMovieName,Model model)
//	{
//		
//		System.out.println("Into MovieDescription:::"+strMovieName);
//		
//		List<Movie_Details> test =service.searchMovie(strMovieName);
//		for(Movie_Details c:test)
//		{
//			System.out.println(c.getPoster());
//			System.out.println(c.getReleased());
//			System.out.println(c.getTitle());
//			model.addAttribute("Title", c.getTitle());
//			model.addAttribute("ReleasedYear", c.getReleased());
//			model.addAttribute("Poster", c.getPoster());
//			model.addAttribute("OverView", c.getPlot());
//			model.addAttribute("Genre", c.getGenre());
//			model.addAttribute("Year", c.getYear());
//			model.addAttribute("Director", c.getDirector());
//			model.addAttribute("ScreenPlay", c.getWriter());
//			model.addAttribute("Actors", c.getActors());
//			model.addAttribute("RunTime", c.getRuntime());
//			model.addAttribute("Language", c.getLanguage());
//			model.addAttribute("Rated", c.getRated());
//		}
//		return "MovieDescription";
//	}
//	
//	
//	
//	@GetMapping("/searchMainMovie")
//	public String getMovieDetails(@RequestParam("MovieName") String strMovieName,@RequestParam("Type") String strType,
//			@RequestParam("Year") String strYear,Model model)
//	{
////		System.out.println("language::::"+language);
//		System.out.println("strMovieName::::"+strMovieName);
//		System.out.println("strType::::"+strType);
//		System.out.println("strYear::::"+strYear);
//		List<Movie_Details> test =service.searchMovie(strMovieName,strType,strYear);
//		String strMovieCollection="";
//		int count=0;
//		for(Movie_Details c:test)
//		{
//			count++;
////			strMovieCollection=strMovieCollection+c.getPoster()+"~"+c.getReleased()+"~"+c.getTitle()+"|";
//			model.addAttribute("Title"+count, c.getTitle());
//			model.addAttribute("ReleasedYear"+count, c.getReleased());
//			model.addAttribute("Poster"+count, c.getPoster());
//			
//
//		}
//		model.addAttribute("Count",count);
//		
//		return "MovieList";
//		
//	}
	
}
