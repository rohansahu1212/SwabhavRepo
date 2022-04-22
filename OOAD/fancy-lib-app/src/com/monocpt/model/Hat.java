package com.monocpt.model;

public class Hat {
	private String shortName;
	private String longName;
	private double basePrice;
	private double gst = 8.00;

	public Hat(String shortName, String longName, double basePrice) {

		this.shortName = shortName;
		this.longName = longName;
		this.basePrice = basePrice;
	}

	public String getShortName() {
		return shortName;
	}

	public String getLongName() {
		return longName;
	}

	public double getBasePrice() {
		return basePrice+(gst/100.00)*basePrice;
	}

}
