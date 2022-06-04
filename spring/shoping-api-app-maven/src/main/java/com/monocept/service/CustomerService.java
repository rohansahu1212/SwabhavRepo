package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.dto.CustomerDTO;
import com.monocept.model.Customer;
import com.monocept.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public CustomerService() {
		System.out.println("customer serrvice created");
	}

	public void addCustmer(CustomerDTO customerDTO) {
		customerRepository.addCustomer(customerDTO);
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}

	public Customer getCustomer(int id) {
		return customerRepository.getCustomer(id);
	}
}
