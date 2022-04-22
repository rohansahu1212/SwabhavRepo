package com.monocept.model;

public class OrderDb implements IDataAccessible {

	@Override
	public void read() {
		System.out.println("reading data in OderDB");

	}

	@Override
	public void create() {
		System.out.println("creating data in orderDB");
	}

	@Override
	public void update() {
		System.out.println("updating datat in orderDB");

	}

	@Override
	public void delete() {
		System.out.println("deleting data in orderDB");
	}

}
