package com.monocept.model.test;

import com.monocept.model.Account;

public class EqualityTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Rohan", 5000);
		Account acc2 = new Account(101, "Rohan", 5000);
		System.out.println(acc1 == acc2);
		System.out.println(acc1.equals(acc2));
	}

}
