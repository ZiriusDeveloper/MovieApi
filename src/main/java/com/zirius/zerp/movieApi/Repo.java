package com.zirius.zerp.movieApi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Model, Long> {

	Model findByImdbId(String ImdbId);

	@Query("SELECT c FROM Model c WHERE (:imdbId is null or c.imdbId = :imdbId)")
	List<Model> findIdByImdbId(@Param("imdbId") String imdbId);
}