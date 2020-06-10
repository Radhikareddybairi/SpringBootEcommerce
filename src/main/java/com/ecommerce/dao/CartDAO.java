package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.model.Cart;

public interface CartDAO {

	Cart findCart(int cartId);

	boolean deleteCart(int cartId);

	boolean updateCart(Cart cart);

	boolean addCart(Cart cart);

	 List<Cart> findAllCart();
}
