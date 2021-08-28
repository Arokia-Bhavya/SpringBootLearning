package com.store.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.order.domain.OrderItem;
import com.store.order.domain.OrderResponse;
import com.store.order.repository.OrderItemRepository;
import com.store.order.repository.OrderRepository;
import com.store.order.domain.Order;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderItemRepository repo;
	
	@Autowired
	OrderRepository orderRepo;

	@Override
	public void updateOrderItem(OrderItem orderItemToBeUpdated) {
		Optional<OrderItem> orderItem=repo.findById(orderItemToBeUpdated.getId());
		orderItemToBeUpdated.setCreatedAt(orderItem.get().getCreatedAt());
		repo.save(orderItemToBeUpdated);
	}

	@Override
	public OrderResponse buildOrderResponse(OrderItem orderItem) {
		Order order=orderRepo.findById(orderItem.getorderid()).get();
		order.setDiscount(order.getDiscount() + orderItem.getDiscount());		
		order.setTotal(order.getTotal() + orderItem.getPrice());
		List<OrderItem> orderItems=repo.findByorderid(orderItem.getorderid());
		OrderResponse orderResponse=new OrderResponse();
		orderResponse.setOrder(order);
		orderResponse.setOrderItems(orderItems);
		return orderResponse;
	}

	@Override
	public OrderResponse buildOrderResponse(List<OrderItem> orderItems) {
		Order order=orderRepo.findById(orderItems.get(0).getorderid()).get();
		OrderResponse orderResponse=new OrderResponse();
		orderResponse.setOrder(order);
		orderResponse.setOrderItems(orderItems);
		return orderResponse;
	}

}
