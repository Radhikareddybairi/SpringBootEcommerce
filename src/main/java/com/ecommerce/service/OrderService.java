package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Order;

public interface OrderService {

	Order findOrder(int orderId);

	boolean deleteOrder(int orderId);

	boolean updateOrder(Order order);

	boolean addOrder(Order order);

	List<Order> findAllOrder();
}
