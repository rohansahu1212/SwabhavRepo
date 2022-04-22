package com.monocept.model;

public class Kid extends Man {
	static {
		System.out.println("Kid static");
	}
	@Override
	public void play() {
		System.out.println("Kid is playing");
	}

}
