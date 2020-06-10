package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
private int custometId;
private String customerName;
private String customerAddress;
private String customerEmail;
private String customerPhoneNo;
private String customerGender;
private Order order;
private Cart cart;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("customer.....");
}
@Id
@GeneratedValue(strategy=GenerationType.AUTO,generator="customertbl")
public int getCustometId() {
	return custometId;
}
public void setCustometId(int custometId) {
	this.custometId = custometId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public String getCustomerPhoneNo() {
	return customerPhoneNo;
}
public void setCustomerPhoneNo(String customerPhoneNo) {
	this.customerPhoneNo = customerPhoneNo;
}
public String getCustomerGender() {
	return customerGender;
}
public void setCustomerGender(String customerGender) {
	this.customerGender = customerGender;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
}
