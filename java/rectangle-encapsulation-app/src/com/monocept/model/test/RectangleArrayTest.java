package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleArrayTest {
	private static void printDetails(Rectangle rect) {
		System.out.println("height of rectangle " + rect.getHeight() + " of referance " + rect);
		System.out.println("widht of rectangle " + rect.getWidht() + " of referance " + rect);
		System.out.println("area of rectangle " + rect.calculateArea() + " of referance " + rect);
	}

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		//RectangleArrayTest r = new RectangleArrayTest();
		r1.setHeight(10);
		r1.setWidht(20);

		Rectangle r2 = new Rectangle();
		r2.setHeight(20);
		r2.setWidht(40);

		Rectangle[] manyRectangles = new Rectangle[3];
		manyRectangles[0] = r1;
		manyRectangles[1] = r2;
		manyRectangles[2] = new Rectangle();

		manyRectangles[2].setHeight(50);
		manyRectangles[2].setWidht(20);

		for (Rectangle rectangle : manyRectangles) {
			printDetails(rectangle);

		}
	}
}
