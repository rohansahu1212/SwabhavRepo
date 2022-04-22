package com.monocept.factory;

class Tesla implements AutoMobile {

	@Override
	public void start() {
		System.out.println("tesla started");

	}

	@Override
	public void stop() {
		System.out.println("tesla stop");
	}

}
