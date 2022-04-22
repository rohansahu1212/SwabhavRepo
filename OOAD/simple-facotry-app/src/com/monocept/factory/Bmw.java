package com.monocept.factory;

class Bmw implements AutoMobile {

	@Override
	public void start() {
		System.out.println("Bmw start");

	}

	@Override
	public void stop() {
		System.out.println("Bmw Stop");
	}

}
