package com.monocept.model;

public class AccountExceptionTest {
	public static void main(String[] args) {
		   caseStudy1();
		try {
			caseStudy2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void caseStudy1() {
		Account acc = new Account(102, "Rohan", 222000);
		acc.withdraw(1600);
		printDetails(acc);

	}

	private static void caseStudy2() {
		Account acc = new Account(102, "Vijay", 2000);
		acc.withdraw(1600);
		printDetails(acc);

		Account acc1 = new Account(102, "vineet", 222000);
		acc1.withdraw(1600);
		printDetails(acc1);

	}

	private static void printDetails(Account acc) {
		System.out.println("account number " + acc.getAccno());
		System.out.println("holder name " + acc.getName());
		System.out.println("balnace " + acc.getBalance());
	}
}
