package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Cart;

public interface CartService {
	
	Cart findCart(int cartId);

	boolean deleteCart(int cartId);

	boolean updateCart(Cart cart);

	boolean addCart(Cart cart);

	List<Cart> findAllCart();
}
