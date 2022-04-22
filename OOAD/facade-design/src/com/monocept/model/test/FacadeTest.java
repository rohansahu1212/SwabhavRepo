package com.monocept.model.test;

import com.monocept.model.ShapeCreater;

public class FacadeTest {
	public static void main(String[] args) {
		ShapeCreater sc = new ShapeCreater();
		sc.drawCircle();
		sc.drawRectangle();
		sc.drawSquare();
	}
}
