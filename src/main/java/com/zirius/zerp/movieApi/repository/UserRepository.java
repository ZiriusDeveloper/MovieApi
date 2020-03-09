package com.zirius.zerp.movieApi.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zirius.zerp.movieApi.Model.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT userTable FROM User userTable WHERE userTable.username=?1")
	Optional<User> findByUserName(String username);
	
	Boolean existsByUsername(String username);

}
