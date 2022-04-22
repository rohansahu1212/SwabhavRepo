package com.monocept.model;

public class Circle {
	private float radius;
	private BorderOptions border;

	public Circle(float pradius) {
		radius = pradius;
	}

	public Circle(float pradius, BorderOptions pboder) {
		radius = pradius;
		border=pboder;
	}
	public float calculateArea(){
		float area=(float) (radius*radius*Math.PI);
		return area;
	}
	public float getRadius() {
		return radius;
	}
	public BorderOptions getBorder() {
		return border;
	}
}
