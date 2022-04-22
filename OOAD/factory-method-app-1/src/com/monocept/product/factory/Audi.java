package com.monocept.product.factory;

 class Audi implements Auto {

	@Override
	public void start() {
		System.out.println("audi start");
	}

	@Override
	public void stop() {
		System.out.println("auid stop");
	}

}
