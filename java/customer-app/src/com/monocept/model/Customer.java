package com.monocept.model;

public class Customer {
	private String id;
	private String name;
	private String location;
	private int oderAmount;
	private static int idGenrator;
	static {
		idGenrator = 100;
	}

	public Customer(String name, String location, int orderAmount) {
		this.name = name;
		this.location = location;
		this.oderAmount = orderAmount;
		this.id = "C" + idGenrator++;

	}

	public String getName() {
		return this.name;
	}

	public String getLocation() {
		return this.location;
	}

	public String getId() {
		return this.id;
	}

	public int getOrderAmount() {
		return this.oderAmount;
	}

}
