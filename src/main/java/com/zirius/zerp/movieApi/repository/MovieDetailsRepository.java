package com.zirius.zerp.movieApi.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zirius.zerp.movieApi.Model.MovieDetails;

@Repository
@Transactional
public interface MovieDetailsRepository extends JpaRepository<MovieDetails, Integer> {

	@Query("SELECT movie FROM MovieDetails movie WHERE movie.type=?1 AND movie.year=?2")
	List<MovieDetails> findByTypeaAndYear(String type, String year);
	

}
