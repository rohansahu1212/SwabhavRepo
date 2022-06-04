package com.monocept.dto;

import javax.persistence.Entity;
import javax.persistence.Id;


public class CustomerDTO {
	
	private int id;
	private String customerName;

	public CustomerDTO() {

	}

	public CustomerDTO(int id, String customerName) {
		super();
		this.id = id;
		this.customerName = customerName;
	}

	public int getId() {
		return id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
