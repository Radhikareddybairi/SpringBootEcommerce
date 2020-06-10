package com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
private int cartId;
private int cartQuantity;
private Customer customer;
private Product product;

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
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}


}
