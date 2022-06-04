package com.monocept.model.test;

import com.monocept.model.Circle;
import com.monocept.model.ShapeFactory;

public class FlyweightPatternDemoTest {
	private static final String colors[] = { "Red", "Green", "Blue", "Orange", "Black" };

	public static void main(String[] args) {

		System.out.println("\n---------------------- Red color Circles ----------------------");
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[0]);
			circle.draw();
			System.out.println(circle.hashCode()+"-------------------------------------look hash");
		}
		System.out.println("\n ---------------------- Green color Circles ----------------------");
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[1]);
			circle.draw();
			System.out.println(circle.hashCode()+"-------------------------------------look hash");
		}
		System.out.println("\n---------------------- Blue color Circles ----------------------");

		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[2]);
			circle.draw();
			System.out.println(circle.hashCode()+"-------------------------------------look hash");
		}
		System.out.println("\n------------------ Orange color Circles ----------------------");
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[3]);
			circle.draw();
			System.out.println(circle.hashCode()+"-------------------------------------look hash");
		}
		System.out.println("\n----------------------- Black color Circles -----------------------");
		for (int i = 0; i < 10; ++i) {
			Circle circle = (Circle) ShapeFactory.getShape("circle");
			circle.setColor(colors[4]);
			circle.draw();
			System.out.println(circle.hashCode()+"-------------------------------------look hash");
		}
	}
}
