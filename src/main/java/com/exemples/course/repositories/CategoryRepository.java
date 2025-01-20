package com.exemples.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemples.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
