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

import com.store.order.domain.Order;
import com.store.order.repository.OrderRepository;

@RestController
@RequestMapping("/store-app/orders")
public class OrderManagementController {
	@Autowired
	OrderRepository repo;
	@GetMapping
	public List<Order> listOrders()
	{
		return repo.findAll();
	}
	
	@GetMapping("/{orderId}")
	public Optional<Order> listOrdersbyOrderId(@PathVariable Long orderId)
	{
		return repo.findById(orderId);
	}
	
	@PostMapping
	public  HttpStatus createOrder(@RequestBody Order order)
	{
		repo.save(order);
		return HttpStatus.OK;
	}
	
	@PutMapping("/{orderId}")
	public HttpStatus updateOrder(@RequestBody Order order)
	{
		repo.save(order);
		return HttpStatus.OK;
	}
	
	@DeleteMapping("/{orderId}")
	public HttpStatus DeleteOrder(@PathVariable Long orderId)
	{
		repo.deleteById(orderId);
		return HttpStatus.OK;
	}

	
}