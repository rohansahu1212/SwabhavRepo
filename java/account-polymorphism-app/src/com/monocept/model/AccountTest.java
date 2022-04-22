package com.monocept.model;

public class AccountTest {
	public static void main(String[] args) {

		Account[] aa = { new SavingAccount(102, "shikar singh", 3200000),
				new CurrentAccount(101, "rohan sahu", 7000000), new CurrentAccount(103, "vineet", 788000),
				new SavingAccount(104, "ramya", 3280000) };
		printDetails(aa);
	}

	private static void printDetails(Account[] acc) {

		for (Account account : acc) {
			printDetails(account);
		}
	}

	private static void printDetails(Account acc) {
		System.out.println("account number " + acc.getAccno());
		System.out.println("holder name " + acc.getName());
		System.out.println("balnace " + acc.getBalance());
		System.out.println("Account type " +acc.getClass().getSimpleName());
	}
}
