package com.store.order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.store.order.domain.OrderItem;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {
	List<OrderItem> findByorderid(Long orderid);	
	Optional<OrderItem> findById(Long id);	
	OrderItem save(OrderItem order);
	void save(List<OrderItem> orderItems );
	void deleteById(OrderItem orderitem);
	void deleteByorderid(Long orderid);
}
