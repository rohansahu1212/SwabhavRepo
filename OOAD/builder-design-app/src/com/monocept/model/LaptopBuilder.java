package com.monocept.model;

public class LaptopBuilder {
	Laptop laptop;

	public LaptopBuilder() {
		laptop = new Laptop();
	}

	public LaptopBuilder addKeypad(String type) {
		laptop.keypad = type;

		return this;
	}

	public LaptopBuilder addTouchpad(String type) {
		laptop.touchpad = type;

		return this;
	}

	public LaptopBuilder addRam(String type) {
		laptop.ram = type;

		return this;
	}

	public LaptopBuilder addSdd(String type) {
		laptop.ssd = type;

		return this;
	}

	public Laptop getLaptop() {
		return laptop;
	}
}
