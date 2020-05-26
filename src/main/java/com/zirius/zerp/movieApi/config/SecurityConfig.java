package com.zirius.zerp.movieApi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired private MyBasicAuthenticationEntryPoint authenticationEntryPoint;
	@Override
    protected void configure(HttpSecurity http) throws Exception 
    {
        http
         .csrf().disable().exceptionHandling()
         .authenticationEntryPoint(authenticationEntryPoint).and()
         .httpBasic().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
         .antMatchers("/**").permitAll().and().authorizeRequests().anyRequest().
         authenticated().and().addFilterBefore(new CustomFilter(), BasicAuthenticationFilter.class);
    }
  
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception 
    {
        String password = passwordEncoder().encode("admin@123");
        auth.inMemoryAuthentication()
            .withUser("admin")
            .password(password)
            .roles("USER");
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	

}
