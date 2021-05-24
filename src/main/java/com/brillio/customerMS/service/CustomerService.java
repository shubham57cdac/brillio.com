package com.brillio.customerMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.customerMS.model.Customer;
import com.brillio.customerMS.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer getCustomer(Long id) {
		return customerRepository.findById(id).get();
	}

}