package com.monocept.model;

public class FooChildDb extends FooDb {

	@Override
	public void read() {
		System.out.println("reading in child foo");

	}

	@Override
	public void update() {
		System.out.println("updating in foo child");
	}

	@Override
	public void delete() {
		System.out.println("deleting in foo child");
	}

}
