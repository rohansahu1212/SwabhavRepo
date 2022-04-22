package com.monocept.model;

public abstract class Vehichle implements IMovable {
	private String description;

	public Vehichle(String description) {
		this.description=description;
	}
	@Override
	public
	void move() {
		System.out.println(description + " moving " );
	}

}
