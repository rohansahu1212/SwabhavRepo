package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		Rectangle big = new Rectangle();
		big.setHeight(100);
		big.setWidht(77);
		small.setHeight(101);
		small.setWidht(44);
		System.out.println("height of small rectangle " + small.getHeight());
		System.out.println("widht of small rectangle " + small.getWidht());
		System.out.println("height of small rectangle " + big.getHeight());
		System.out.println("widht of small rectangle " + big.getWidht());

		small.setHeight(-1);
		small.setWidht(0);
		System.out.println("height of small rectangle " + small.getHeight());
		System.out.println("widht of small rectangle " + small.getWidht());

		System.out.println("area of rectangle is " + small.calculateArea());// small rectangle
		System.out.println("area of rectangle is " + big.calculateArea());// big rectangle

	}
}
