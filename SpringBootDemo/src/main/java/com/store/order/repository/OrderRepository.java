package com.store.order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.store.order.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findAll();
	Optional<Order> findById(Long id);	
	Order save(Order order);
}
