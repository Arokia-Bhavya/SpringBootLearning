package com.store.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.order.domain.OrderItem;
import com.store.order.repository.OrderItemRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderItemRepository repo;

	@Override
	public void updateOrderItem(OrderItem orderItemToBeUpdated) {
		Optional<OrderItem> orderItem=repo.findById(orderItemToBeUpdated.getId());
		orderItemToBeUpdated.setCreatedAt(orderItem.get().getCreatedAt());
		repo.save(orderItemToBeUpdated);
	}

}
