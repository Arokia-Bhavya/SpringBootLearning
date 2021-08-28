package com.store.order.service;


import java.util.List;

import com.store.order.domain.OrderItem;
import com.store.order.domain.OrderResponse;

public interface OrderService {
	void updateOrderItem(OrderItem orderItem);

	OrderResponse buildOrderResponse(OrderItem orderItem);

	OrderResponse buildOrderResponse(List<OrderItem> orderItems);

}
