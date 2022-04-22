package com.monocept.model;

public interface Animal {
	public void eat();

	public void makeSound();

	default public void sleep() {
		System.out.println("i am sleeping");
	}
}
