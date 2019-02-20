package com.bitconex.challenge.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bitconex.challenge.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query(value = "SELECT *  FROM  APP_USER  WHERE ID =:userId ", nativeQuery = true)
	User getUserById(@Param("userId") Long userId);
	
	
}

