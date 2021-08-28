package com.store.order.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.store.order.domain.OrderItem;
import com.store.order.domain.OrderResponse;
import com.store.order.repository.OrderItemRepository;
import com.store.order.service.OrderService;

@RestController
@RequestMapping("/store-app")
public class OrderItemManagementController {
	@Autowired
	OrderItemRepository repo;	
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orderItem/{orderItemId}")
	public Optional<OrderItem> listOrdersbyOrderId(@PathVariable Long orderItemId)
	{
		return repo.findById(orderItemId);
	}
	
	@PostMapping("/{orderId}/orderItem")
	public  OrderResponse createOrderItem(@PathVariable Long orderId,@RequestBody OrderItem orderItem)
	{
		orderItem.setorderid(orderId);
		repo.save(orderItem);
		OrderResponse orderResponse=orderService.buildOrderResponse(orderItem);
		return orderResponse;
	}
	
	@PostMapping("/{orderId}/orderItems")
	public OrderResponse createOrderItems(@PathVariable Long orderId,@RequestBody List<OrderItem> orderItems)
	{
		repo.save(orderItems);
		OrderResponse orderResponse=orderService.buildOrderResponse(orderItems);
		return orderResponse;
	}
	
	@PutMapping("/orderItem")
	public  OrderResponse updateOrderItem(@RequestBody OrderItem orderItem)
	{
		orderService.updateOrderItem(orderItem);	
		OrderResponse orderResponse=orderService.buildOrderResponse(orderItem);
		return orderResponse;
	}
	
	@PutMapping("/{orderId}/orderItems")
	public OrderResponse updateOrderItems(@PathVariable Long orderId,@RequestBody List<OrderItem> orderItems)
	{
		repo.save(orderItems);
		OrderResponse orderResponse=orderService.buildOrderResponse(orderItems);
		return orderResponse;
	}
	
	@DeleteMapping("/orderItem/{orderItemId}")
	public HttpStatus DeleteOrderItem(@PathVariable Long orderItemId)
	{
		repo.deleteById(orderItemId);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/orderItems/{orderId}")
	public HttpStatus DeleteOrderItems(@PathVariable Long orderId)
	{
		repo.deleteByorderid(orderId);
		return HttpStatus.OK;
	}

	
}
