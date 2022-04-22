package com.monocept.model;

public class Laptop {
	String ram;
	String ssd;
	String keypad;
	String touchpad;

	public String getRam() {
		return ram;
	}

	public String getSsd() {
		return ssd;
	}

	public String getKeypad() {
		return keypad;
	}

	public String getTouchpad() {
		return touchpad;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", ssd=" + ssd + ", keypad=" + keypad + ", touchpad=" + touchpad + "]";
	}

}
