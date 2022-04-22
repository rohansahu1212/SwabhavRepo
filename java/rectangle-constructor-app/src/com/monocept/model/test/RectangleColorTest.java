package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleColorTest {
	private static void printDetails(Rectangle rectangle) {
		System.out.println("height of rectangle " + rectangle.getHeight());
		System.out.println("widht of rectangle " + rectangle.getWidht());
		System.out.println("area of rectangle " + rectangle.calculateArea());
		System.out.println("color of rectangle " + rectangle.getColor());
	}

	public static void main(String[] args) {
		Rectangle small = new Rectangle(10, 20, "BLUE");
		printDetails(small);
		small.setWidht(40);
		printDetails(small);
		Rectangle large = new Rectangle(10, 20, "black");
		printDetails(large);
	}
}
