package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.dto.CustomerDTO;
import com.monocept.model.Customer;
import com.monocept.service.CustomerService;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping(path = "/all")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		return ResponseEntity.ok(customerService.getAllCustomers());
	}

	@GetMapping(path = "single/{id}")
	public ResponseEntity<Customer> getSingleCustomer(@PathVariable("id") String id) {
		return ResponseEntity.ok(customerService.getCustomer(Integer.valueOf(id)));
	}

	@PostMapping(path = "/add")
	public ResponseEntity<CustomerDTO> addCustomer(@RequestBody CustomerDTO customerDto) {
		customerService.addCustmer(customerDto);
		return ResponseEntity.ok(customerDto);
	}
}
