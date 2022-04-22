package com.monocept.basics;

public class WrapperClassTest {
	public static void main(String[] args) {
		int numberOne = 5;
		
		Integer valueOne = new Integer(numberOne); // this is boxing

		int numberTwo = valueOne.intValue(); // assigning value this way is known as unboxing

		Integer valueTwo = numberOne; // auto unboxing

		int numberThree = valueTwo; // auto unboxing

		System.out.println("numberOne is " + numberOne);
		System.out.println("numberTwo  is " + numberTwo);
		System.out.println("numberthree is " + numberThree);
		System.out.println("valueOne is " + valueOne);
		System.out.println("valueTwo is " + valueTwo);

	}
}
