package com.monocept.model;

public class Hippo implements Animal {

	@Override
	public void eat() {
	System.out.println("I am hippo, i eat veg only");
		
	}

	@Override
	public void makeSound() {
		System.out.println("hippo sound like: khaoo khau");
		
	}

}
