package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleRefTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setHeight(10);
		r1.setWidht(20);
		System.out.println("r1 height is " + r1.getHeight());
		System.out.println("r1 widht is " + r1.getWidht());
		Rectangle r2;
		r2 = r1;

		System.out.println("r2 height is " + r2.getHeight());
		System.out.println("r2 widht is " + r2.getWidht());
		
		r2.setWidht(100);
		System.out.println("r2 widht is " + r2.getWidht());
		System.out.println("r1 widht is " + r1.getWidht());
		
		
		
	}
}
