package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SOrder {
	@Id
	private int oid;
	private String orderName;

	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "sorder", cascade = CascadeType.ALL)
	List<LineItem> lineItems;

	public SOrder() {

	}

	public SOrder(int oid, String name) {

		this.oid = oid;
		this.orderName = name;
		lineItems= new ArrayList<LineItem>();
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getName() {
		return orderName;
	}

	public void setName(String name) {
		this.orderName = name;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void addLineItem(LineItem item) {
		lineItems.add(item);
	}

}