package com.zirius.zerp.movieApi.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	
	@Bean
	public RestTemplate get_restTemplate() {
		return new RestTemplate();
	}
}
