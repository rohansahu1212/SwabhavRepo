package com.monocept.model;

public class ShapeCreater {
	public void drawRectangle() {
		Shape shape = new Circle();
		shape.drawShape();
	}

	public void drawCircle() {
		Shape shape = new Rectangle();
		shape.drawShape();
	}
	public void drawSquare() {
		Shape shape= new Square();
		shape.drawShape();
	}
}
