package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountWithDrawTest {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "rohan", 20000);
		Account acc2 = new Account(103, "shikar");
		acc1.withdraw(200);
		acc2.withdraw(300);
		printDetails(acc1);
		printDetails(acc2);
	}

	public static void printDetails(Account acc) {
		System.out.println("account number " + acc.getAccno());
		System.out.println("holder name " + acc.getName());
		System.out.println("balnace " + acc.getBalance());
	}

}
