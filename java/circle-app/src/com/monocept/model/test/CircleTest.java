package com.monocept.model.test;

import com.monocept.model.BorderOptions;
import com.monocept.model.Circle;

public class CircleTest {

	public static void main(String[] args) {
		Circle[] c = new Circle[3];

		Circle c1 = new Circle(50);
		Circle c2 = new Circle(50);
		Circle c3 = new Circle(50);
		Circle c4 = new Circle(50, BorderOptions.DOTTED);
		c[0] =  new Circle(50);
		c[1] =  new Circle(60);
		c[2] =  new Circle(70);
		printDetails(c1);
		printDetails(c4);
		
	//	Circle maxArea=findLargestCircle(c);
		printDetails(findLargestCircle(c));
	}

	public static void printDetails(Circle circle) {
		System.out.println("area of circle " + circle.calculateArea());
		System.out.println("radius of cirle " + circle.getRadius());
		System.out.println("border of circle " + circle.getBorder());
	}

	public static Circle findLargestCircle(Circle[] circles) {
		Circle maxCircle = null;
		float area = 0;
		for (Circle ref : circles) {
			if (ref.calculateArea() > area)
				maxCircle = ref;
		}
		return maxCircle;
	}

}
