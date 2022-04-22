package com.monocept.test;

public class StringAppentTest {
	public static void main(String[] args) {
		String name = new StringBuilder().append("rohan").append("sahu").toString();
		System.out.println(name);
		System.out.println(new StringBuilder().append("rohan").getClass());
	}
}
