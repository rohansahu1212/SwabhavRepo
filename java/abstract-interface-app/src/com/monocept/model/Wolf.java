package com.monocept.model;

public class Wolf implements Animal{

	@Override
	public void eat() {
		System.out.println("i am wolf, i eat non veg");
		
	}

	@Override
	public void makeSound() {
		System.out.println("wolf sound, aaauuuuuuuuuuuuuuuuuuuu");
		
	}

}
