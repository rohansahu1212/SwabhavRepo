package com.monocept.model;

public class DepartmentDb implements IDataAccessible{
	@Override
	public void read() {
		System.out.println("reading data in DepartmentDB");

	}

	@Override
	public void create() {
		System.out.println("creating data in DepartmentDB");
	}

	@Override
	public void update() {
		System.out.println("updating datat in  DepartmentDB");

	}

	@Override
	public void delete() {
		System.out.println("deleting data in  DepartmentDB");
	}

}
