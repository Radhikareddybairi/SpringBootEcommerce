package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;
import com.ecommerce.repository.OrderRepository;
import com.ecommerce.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
private OrderRepository orderRepository;
	
	public OrderServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Order findOrder(int orderId) {
		// TODO Auto-generated method stub
		return orderRepository.findById(orderId).get();
	}

	@Override
	public boolean deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		Order o = orderRepository.findById(orderId).get();

		if (o != null) {
			orderRepository.delete(o);
			return true;
		}

		return false;
	}

	@Override
	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		Order o = orderRepository.findById(order.getOrderId()).get();

		if (o != null) {
			orderRepository.save(order);
			return true;
		}
		return false;
	}

	@Override
	public boolean addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order)==order;
	}

	@Override
	public List<Order> findAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
