package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args) {

		Account acc1 = new Account(102, "rohan", 200000);
		System.out.println(acc1.getCount());
		System.out.println(Account.headCount());
		System.out.println(acc1.hashCode());

		Account acc2 = new Account(103, "shikhar");
		System.out.println(acc1.getCount());
		System.out.println(Account.headCount());
		System.out.println(acc2.hashCode());

		Account acc3 = new Account(130, "vineet", 200000);
		System.out.println(acc1.getCount());
		System.out.println(Account.headCount());
		System.out.println(acc3.hashCode());
	}

}
