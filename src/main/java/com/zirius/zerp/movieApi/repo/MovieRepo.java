package com.zirius.zerp.movieApi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zirius.zerp.movieApi.entity.MovieDetails;

@Repository
public interface MovieRepo extends JpaRepository<MovieDetails, Integer> {
	List<MovieDetails> findByTypeAndYear(String type, String year);
}
