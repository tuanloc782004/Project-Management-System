package com.tuanloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuanloc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
