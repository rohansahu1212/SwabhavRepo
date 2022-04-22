package com.monocept.basics;

public class caseStudyTest {
	private void casestudy1() {
		String userName = "Rohan";
		System.out.println(userName);
		System.out.println(userName.toUpperCase());
		System.out.println(userName);
	}

	private void casestudy2() {
		String userName = "Rohan";
		System.out.println(userName.hashCode());
		userName += " Monocept";
		System.out.println(userName.hashCode());
		userName += " Hyderabad";
		System.out.println(userName.hashCode());
		System.out.println(userName);
	}

	public static void main(String[] args) {
		caseStudyTest ob = new caseStudyTest();
		System.out.println("case study 1 output");
		ob.casestudy1();
		System.out.println("case study 2 output");
		ob.casestudy2();
	}
}
