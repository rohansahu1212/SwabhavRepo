package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customer {
	@Id
	private int id;
	private String customerName;
	@JsonManagedReference
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Orders> ordersss ;

	public Customer() {
     ordersss=new ArrayList<Orders>();
	}

	public Customer(int id, String name) {
		this.id = id;
		this.customerName = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return customerName;
	}

	public List<Orders> getOrders() {
		return ordersss;
	}

	public void addOrder(Orders order) {
		ordersss.add(order);

	}


	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.customerName = name;
	}

	public void setOrders(List<Orders> orders) {
		this.ordersss = orders;
	}
}
