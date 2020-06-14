package com.ecommerce.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.context.annotation.Configuration;
@Configuration
@Entity
public class Product {
private int productId;
private String productName;
private double productPrice;
private Category category;
private Cart cart;
private Order order;
public Product() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("product..");
}
@Id
@GeneratedValue(strategy=GenerationType.AUTO,generator="producttbl")
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="categoryId")
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
@ManyToOne
@JoinColumn(name="cartId", nullable=false)
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}

}
