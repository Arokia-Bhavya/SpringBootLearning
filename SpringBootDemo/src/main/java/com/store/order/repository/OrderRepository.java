package com.store.order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.store.order.domain.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByuserid(Long userid);
	List<Order> findAll();
	Optional<Order> findById(Long id);	
	Order save(Order order);
}
