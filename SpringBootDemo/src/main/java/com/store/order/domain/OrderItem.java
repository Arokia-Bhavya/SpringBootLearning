package com.store.order.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	int productId;
	int orderId;
	int price;
	int quantity;
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", productId=" + productId + ", orderId=" + orderId + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private OrderItem(int id, int productId, int orderId, int price, int quantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.orderId = orderId;
		this.price = price;
		this.quantity = quantity;
	}
}
