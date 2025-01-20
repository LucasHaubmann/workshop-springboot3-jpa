package com.exemples.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemples.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
