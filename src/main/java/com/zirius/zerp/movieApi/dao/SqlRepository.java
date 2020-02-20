/**
 * 
 */
package com.zirius.zerp.movieApi.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * @author San
 *
 */
@Repository
public interface SqlRepository extends CrudRepository<MovieDetails, Integer> {

    @Query("from MovieDetails")
    List<MovieDetails> findByid();
    
    @Transactional
    @Modifying
    @Query(value="insert into MOVIE_DETAILS (id,movie_name,release_year,movie_type,rating) values (?1,?2,?3,?4,?5)",nativeQuery = true)
	void saveToDB(int id, String movie_name,String release_year,String movie_type, String rating);
    
    @Transactional
    @Modifying
    @Query(value="update MOVIE_DETAILS set movie_name=?2,release_year=?3,movie_type=?4,rating=?5 where id=?1",nativeQuery = true)
	void updateMovie(int id, String movie_name,String release_year,String movie_type, String rating);
    
    
    }
