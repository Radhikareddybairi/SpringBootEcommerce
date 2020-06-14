package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Cart;
import com.ecommerce.repository.CartRepository;
import com.ecommerce.service.CartService;

@Service
public class CartServiceImpl implements CartService{
	@Autowired
	private CartRepository cartRepository;
	
	
	public CartServiceImpl() {
		super();
	}
	
	@Override
	public Cart findCart(int cartId) {
		// TODO Auto-generated method stub
		return cartRepository.findById(cartId).get();
	}
	@Override
	public boolean deleteCart(int cartId) {
		// TODO Auto-generated method stub
		Cart c = cartRepository.findById(cartId).get();

		if (c != null) {
			cartRepository.delete(c);
			return true;
		}
		return false;
	}
	@Override
	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		Cart c = cartRepository.findById(cart.getCartId()).get();

		if (c != null) {
			cartRepository.save(cart);
			return true;
		}
		return false;
	}
	@Override
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		return cartRepository.save(cart)==cart;
	}
	@Override
	public List<Cart> findAllCart() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}
}
