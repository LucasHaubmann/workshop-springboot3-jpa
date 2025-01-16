package com.exemples.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemples.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	 
}
