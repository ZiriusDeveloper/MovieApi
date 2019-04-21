package com.zirius.zerp.movieApi.controller;


import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.zirius.zerp.configuration.MovieApiApplication;
import com.zirius.zerp.constants.MovieConstants;
import com.zirius.zerp.movies.controller.MoviesController;
import com.zirius.zerp.movies.response.MovieResponse;
import com.zirius.zerp.movies.response.Response;
import com.zirius.zerp.movies.service.MoviesService;

@RunWith(SpringRunner.class)
@WebMvcTest(MoviesController.class)
@ContextConfiguration(classes={MovieApiApplication.class})
public class MoviesControllerTest {

	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private MoviesService moviesService;
	
	@Test
	@WithMockUser(username = "user", password = "password", roles = "user")
    public void getMovieByTitle() throws Exception {
		Response response = new Response();
        MovieResponse movieResponse = new MovieResponse();
        
        movieResponse.setTitle("Titanic");
        movieResponse.setGenre("Romantic");
        movieResponse.setRuntime("200");
        movieResponse.setYear("1997");
        response.setStatus(MovieConstants.SUCCESS);
        response.setMessage(MovieConstants.SAVED);
        response.setData(movieResponse);
        
        given(moviesService.getMovieByTitle("Titanic", "1997")).willReturn(response);

        this.mockMvc.perform(get("/movie?title=Titanic"))
                .andExpect(status().isOk());
    }
}
