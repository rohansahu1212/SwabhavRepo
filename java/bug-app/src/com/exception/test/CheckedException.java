package com.exception.test;

public class CheckedException {
	public static void main(String[] args) {
		try {
			m1();
		
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}

	private static void m1() throws Exception {
		System.out.println("inside m1");
		m2();
	}

	private static void m2() throws Exception {
		System.out.println("inside m2");
		m3();
	}

	private static void m3() throws Exception {
		System.out.println("inside m3");
		throw new Exception("somthing went wrong");
	}
}
