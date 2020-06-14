package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Customer;

public interface CustomerService {
	
	Customer findCustomer(int customerId);

	boolean deleteCustomer(int customerId);

	boolean updateCustomer(Customer customer);

	boolean addCustomer(Customer customer);

	List<Customer> findAllCustomer();
}
