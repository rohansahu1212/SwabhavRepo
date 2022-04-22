package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectanglePrintInfoTest {
	private void printDetails(Rectangle rect) {
		System.out.println("height of rectangle "+rect.getHeight());
		System.out.println("widht of rectangle "+rect.getWidht());
		System.out.println("area of rectangle "+rect.calculateArea());
	}
	public static void main(String[] args) {
		RectanglePrintInfoTest rpif=new RectanglePrintInfoTest();
		Rectangle r1 = new Rectangle();
		r1.setWidht(10);
		r1.setHeight(20);
		rpif.printDetails(r1);
		
		Rectangle r2 = new Rectangle();
		r2.setWidht(110);
		r2.setHeight(80);
		rpif.printDetails(r2);
	}

}
