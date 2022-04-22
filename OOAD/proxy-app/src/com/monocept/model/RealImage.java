package com.monocept.model;

public class RealImage implements Image {
	private String fullName;

	public RealImage(String fullName) {

		this.fullName = fullName;
		System.out.println("Image is loadin in ReaLImg " + fullName);
	}

	@Override
	public void display() {
		System.out.println("displayin the image Real" + fullName);
	}

}
