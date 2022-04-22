package com.monocept.model;

public class DogDoor {
	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("\n The Dog Door opens");
		open = true;
	}

	public void close() {
		System.out.println("\n The Dor Door Close.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
}
