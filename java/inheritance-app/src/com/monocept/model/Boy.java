package com.monocept.model;

public class Boy extends Man {
	static {
		System.out.println("Boy static");
	}
	public void eat() {
		System.out.println("Boy is eating");
	}
	@Override
	public void play() {
		System.out.println("boy is playing ");
	}
}
