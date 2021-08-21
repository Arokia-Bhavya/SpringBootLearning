package com.store.order.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="ordertbl")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	Long id;
	
	@Column(name="userid")
	Long userid;
	
	@Column(name="sessionid")
	String sessionId="default";
	
	@Column(name="token")
	String token="default";
	
	@CreationTimestamp
	@Column(name="createdat")
	Timestamp createdAt;
	
	@Column(name="status")
	int status=0;
	
	@Column(name="subtotal")
	float subTotal=0;
	
	@Column(name="itemdiscount")
	float itemDiscount=0;
	
	@Column(name="tax")
	float tax=0;
	
	@Column(name="shipping")
	float shipping=0;
	
	@Column(name="total")
	float total=0;
	
	@Column(name="discount")
	float discount=0;
	
	public String getSessionId() {
		return sessionId;
	}


	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	
	public Timestamp getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public float getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}


	public float getItemDiscount() {
		return itemDiscount;
	}


	public void setItemDiscount(float itemDiscount) {
		this.itemDiscount = itemDiscount;
	}


	public float getTax() {
		return tax;
	}


	public void setTax(float tax) {
		this.tax = tax;
	}


	public float getShipping() {
		return shipping;
	}


	public void setShipping(float shipping) {
		this.shipping = shipping;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public float getDiscount() {
		return discount;
	}


	public void setDiscount(float discount) {
		this.discount = discount;
	}


	public float getGrandtotal() {
		return grandtotal;
	}


	public void setGrandtotal(float grandtotal) {
		this.grandtotal = grandtotal;
	}


	
	@Column(name="grandtotal")
	float grandtotal;
	
	public Long getUserid() {
		return userid;
	}


	public void setUserid(Long userid) {
		this.userid = userid;
	}


	private Order() {
		super();
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	private Order(Long id, Long userid, String sessionId, String token, int status, float subTotal,
			float itemDiscount, float tax, float shipping, float total, float discount, float grandtotal) {
		super();
		this.id = id;
		this.userid = userid;
		this.sessionId = sessionId;
		this.token = token;		
		this.status = status;
		this.subTotal = subTotal;
		this.itemDiscount = itemDiscount;
		this.tax = tax;
		this.shipping = shipping;
		this.total = total;
		this.discount = discount;
		this.grandtotal = grandtotal;
	}
}
