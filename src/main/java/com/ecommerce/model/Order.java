package com.ecommerce.model;



import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Configuration;

@Configuration
@Entity
public class Order {
private int orderId;
private String orderNumber;
private String orderName;
private String orderDate;
private double orderAmount;
private Set<Product> product;
private Customer customer;
public Order() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("order....");
}
@Id
@GeneratedValue(strategy=GenerationType.AUTO,generator="ordertbl")
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getOrderNumber() {
	return orderNumber;
}
public void setOrderNumber(String orderNumber) {
	this.orderNumber = orderNumber;
}
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public double getOrderAmount() {
	return orderAmount;
}
public void setOrderAmount(double orderAmount) {
	this.orderAmount = orderAmount;
}
@OneToMany(mappedBy="order")
public Set<Product> getProduct() {
	return product;
}
public void setProduct(Set<Product> product) {
	this.product = product;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}


}
