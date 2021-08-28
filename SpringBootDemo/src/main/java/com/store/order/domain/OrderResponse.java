package com.store.order.domain;

import java.util.List;
import java.util.Objects;

public class OrderResponse {
	public OrderResponse() {
		super();
	}
	private Order order;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	private OrderResponse(Order order, List<OrderItem> orderItems) {
		super();
		this.order = order;
		this.orderItems = orderItems;
	}
	private List<OrderItem> orderItems;
	
	@Override
	public int hashCode() {
		return Objects.hash(order, orderItems);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderResponse other = (OrderResponse) obj;
		return Objects.equals(order, other.order) && Objects.equals(orderItems, other.orderItems);
	}
	

}
