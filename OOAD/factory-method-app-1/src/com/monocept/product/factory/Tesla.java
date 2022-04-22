package com.monocept.product.factory;

 class Tesla implements Auto {

	@Override
	public void start() {
		System.out.println("tesla start");
	}

	@Override
	public void stop() {
System.out.println("tesla stop");
	}

}
