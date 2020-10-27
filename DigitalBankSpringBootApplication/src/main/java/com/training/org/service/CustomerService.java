package com.training.org.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.org.model.Customer;
import com.training.org.repository.CustomerRepository;

@Service 
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers()  
	{    
		List<Customer> customers = new ArrayList<>();    
		customerRepository.findAll().forEach(customer->customers.add(customer));  
		return customers;    
	} 
	public Customer getCustomerById(String id) {
		Optional<Customer> customer=customerRepository.findById(id);
		if(customer.isPresent())
			return customer.get();
		else
			return null;
	}
}
