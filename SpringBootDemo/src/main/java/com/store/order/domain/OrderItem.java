package com.store.order.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	@Column(name="productid")
	Long productId;
	@Column(name="orderid")
	Long orderid;
	@Column(name="price")
	float price;
	@Column(name="quantity")
	int quantity;	
	@Column(name="sku")
	String sku="default";	
	@Column(name="discount")
	float discount=0.0f;
	@CreationTimestamp
	@Column(name="createdat")
	Timestamp createdAt;	
	@UpdateTimestamp
	@Column(name="updatedat")
	Timestamp updatedAt;
	private OrderItem() {
		super();
	}
	private OrderItem(Long id, Long productId, Long orderid, float price, int quantity,
			String sku, float discount, Long createdBy, Timestamp createdAt,
			Timestamp updatedAt) {
		super();
		this.id = id;
		this.productId = productId;
		this.orderid = orderid;
		this.price = price;
		this.quantity = quantity;		
		this.sku = sku;
		this.discount = discount;		
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getorderid() {
		return orderid;
	}
	public void setorderid(Long orderId) {
		this.orderid = orderId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
