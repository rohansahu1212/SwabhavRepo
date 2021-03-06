package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<SOrder> orders = new ArrayList<SOrder>();

	public Customer() {

	}

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<SOrder> getOrders() {
		return orders;
	}

	public void addOrder(SOrder order) {
		orders.add(order);

	}

	public int getOrderCount() {
		return orders.size();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrders(List<SOrder> orders) {
		this.orders = orders;
	}
}
