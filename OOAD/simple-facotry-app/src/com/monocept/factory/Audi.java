package com.monocept.factory;

class Audi implements AutoMobile {

	@Override
	public void start() {
		System.out.println("Audi started");

	}

	@Override
	public void stop() {
		System.out.println("Audi stop ");
	}

}
