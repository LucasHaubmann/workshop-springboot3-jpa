package com.exemples.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemples.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}