package com.monocept.model;

public class StandardHat implements Hat {

	@Override
	public String getName() {
		return "Standard hat";
	}

	@Override
	public double getPrice() {
		return 300;
	}

	@Override
	public String getDescription() {
		return "it's standard hat";
	}

}
