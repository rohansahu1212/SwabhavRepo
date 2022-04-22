package com.monocept.test;

import com.monocept.model.Laptop;
import com.monocept.model.LaptopBuilder;

public class CreateLaptop {

	public static void main(String[] args) {
		Laptop lappy = new LaptopBuilder()
				.addKeypad("rgb")
				.addRam("32gb")
				.addSdd("4tb")
				.addTouchpad(" Screen touch")
				.getLaptop();

		System.out.println(lappy.getKeypad());
		System.out.println(lappy.getRam());
		System.out.println(lappy.toString());
		System.out.println(lappy.getClass().getSimpleName());
		
		
	}
}
