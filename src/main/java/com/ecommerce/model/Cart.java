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
public class Cart {
private int cartId;
private int cartQuantity;
private Customer customer;
private Set<Product> product;

public Cart() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
@Id
@GeneratedValue(strategy=GenerationType.AUTO,generator="carttbl")
public int getCartQuantity() {
	return cartQuantity;
}
public void setCartQuantity(int cartQuantity) {
	this.cartQuantity = cartQuantity;
}
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="customerId")
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
@OneToMany(mappedBy="cart")
public Set<Product> getProduct() {
	return product;
}
public void setProduct(Set<Product> product) {
	this.product = product;
}



}
