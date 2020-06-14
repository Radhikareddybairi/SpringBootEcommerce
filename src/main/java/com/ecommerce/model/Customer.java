package com.ecommerce.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Configuration;
@Configuration
@Entity
public class Customer {
private int customerId;
private String customerName;
private String customerAddress;
private String customerEmail;
private String customerPhoneNo;
private String customerGender;
private Set<Order> order;
private Cart cart;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("customer.....");
}
@Id
@GeneratedValue(strategy=GenerationType.AUTO,generator="customertbl")
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
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
@OneToMany(mappedBy="customer")
public Set<Order> getOrder() {
	return order;
}
public void setOrder(Set<Order> order) {
	this.order = order;
}
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="carId")
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
