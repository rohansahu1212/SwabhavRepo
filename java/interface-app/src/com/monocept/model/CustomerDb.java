package com.monocept.model;

public class CustomerDb implements IDataAccessible {
	@Override
	public void read() {
		System.out.println("reading data in custumerDB");

	}

	@Override
	public void create() {
		System.out.println("creating data in custumerDB");
	}

	@Override
	public void update() {
		System.out.println("updating datat in custumerDB");

	}

	@Override
	public void delete() {
		System.out.println("deleting data in custumerDB");
	}
}
