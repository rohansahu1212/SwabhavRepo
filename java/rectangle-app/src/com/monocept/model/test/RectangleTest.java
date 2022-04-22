package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest extends Rectangle {

	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		Rectangle big = new Rectangle();
		big.widht=100;
		big.height=50;
		small.widht=10;
		small.height=5;
		System.out.println("height of small rectangle "+small.height);
		System.out.println("height of small rectangle "+small.widht);
		System.out.println("height of small rectangle "+big.widht);
		System.out.println("height of small rectangle "+big.height);
		System.out.println("area of rectangle is "+small.calculateArea());// small rectangle
		System.out.println("area of rectangle is "+big.calculateArea());// big rectangle

	}
}
