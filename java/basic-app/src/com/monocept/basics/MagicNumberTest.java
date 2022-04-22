package com.monocept.basics;

import com.monocept.basics.magic.MagicValue;

public class MagicNumberTest {
	private static double magicNumberArea(int radius) {
		double area = radius * radius * Math.PI;
		return area;
	}
    private static void rohanBdayDate() {
    	System.out.println("Rohan bday fall on "+MagicValue.day+" in month of "+MagicValue.month);
    }
	public static void main(String[] args) {
		System.out.println(magicNumberArea(60));
		rohanBdayDate();
	}
}
