package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {
	private static void printDetails(Rectangle rectangle) {
		System.out.println("height of rectangle " + rectangle.getHeight());
		System.out.println("widht of rectangle " + rectangle.getWidht());
		System.out.println("area of rectangle " + rectangle.calculateArea());
	}

	public static void main(String[] args) {

		Rectangle small = new Rectangle(10, 5);
		printDetails(small);
		small.setWidht(50);
		printDetails(small);

	}

}
