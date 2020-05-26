package com.zirius.zerp.movieApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.zirius.zerp.movieApi"})
@EntityScan("com.zirius.zerp.movieApi.entity")
@EnableJpaRepositories("com.zirius.zerp.movieApi.repo")
public class MovieApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiApplication.class, args); 
	}

}

