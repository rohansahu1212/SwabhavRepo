package com.monocept.model;

public class GoldenHat extends HatDecoator {

	public GoldenHat(Hat hat) {
		super(hat);
	}

	@Override
	public String getName() {
		return hat.getName() + " goldenhat ";
	}

	@Override
	public double getPrice() {

		return hat.getPrice() + 3400;
	}

	@Override
	public String getDescription() {
		return hat.getDescription() + " goledn ring is added";
	}

}
