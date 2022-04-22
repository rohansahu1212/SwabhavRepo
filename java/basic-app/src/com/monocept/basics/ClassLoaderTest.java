package com.monocept.basics;

public class ClassLoaderTest {
	public int i;
	void hey() {
		System.out.println("hey");
	}
	public static void main(String[] args) {
		System.out.println("Displaying class loader information");
		System.out.println(ClassLoader.class.getClassLoader());
		System.out.println(args.getClass().getClassLoader());
		System.out.println(System.class.getClassLoader());
		System.out.println(String.class.getClassLoader());
	}

}
