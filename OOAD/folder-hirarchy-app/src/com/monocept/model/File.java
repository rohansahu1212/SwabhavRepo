package com.monocept.model;

public class File implements Storage {
	private String name;

	public File(String name) {

		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("----"+name);

	}

}
