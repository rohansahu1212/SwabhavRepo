package com.monocept.basics;

public class OverLoadingTest {
	static void printnfo(String str) {
		System.out.println("String is called "+str);
		
	}

	static void printnfo(int num) {
		System.out.println("Integer is called "+num);
	}

	static void printnfo(Double num) {
		System.out.println("Double is called "+num);
	}

	static void printnfo(Float num) {
		System.out.println("Float is called "+num);
	}

	static void printnfo(Boolean bool) {
		System.out.println("Boolean is called "+bool);
	}

	static void printnfo(char ch) {
		System.out.println("Char is called "+ch);
	}

	public static void main(String[] args) {
		OverLoadingTest.printnfo("hello");
		OverLoadingTest.printnfo(100);
		OverLoadingTest.printnfo(100.55);
		OverLoadingTest.printnfo(1 == 0);
		OverLoadingTest.printnfo(100.55f);
		OverLoadingTest.printnfo('#');

	}
}
