package com.ecommerce.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cart {
private int cartId;
private int cartQuantity;
@Autowired
private Customer customer;
@Autowired
private Product product;

}
