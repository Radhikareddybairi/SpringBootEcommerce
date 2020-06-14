package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Customer;
import com.ecommerce.repository.CustomerRepository;
import com.ecommerce.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Customer findCustomer(int customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).get();
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Customer c = customerRepository.findById(customerId).get();

		if (c != null) {
			customerRepository.delete(c);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer c = customerRepository.findById(customer.getCustomerId()).get();

		if (c != null) {
			customerRepository.save(customer);
			return true;
		}
		return false;
	}

	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer)==customer;
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

}
