package com.monocept.model;

public class ProxyImage implements Image {
	private String fullName;
	RealImage realImg;

	public ProxyImage(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public void display() {
		if (realImg == null) {
			realImg = new RealImage(fullName);
			realImg.display();
		}
	}

}
