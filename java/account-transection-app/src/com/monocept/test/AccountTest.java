package com.monocept.test;

import java.util.List;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingAccount;
import com.monocept.model.Transection;

public class AccountTest {
	public static void main(String[] args) {

		Account account = new Account(101, "Rohan sahu", 20000);
		account.deposit(500);
		account.deposit(400);
		account.deposit(300);
		account.withDraw(100);
		account.withDraw(50);
		account.withDraw(500);
		printDetails(account);

	}

	private static void printDetails(Account acc) {
		System.out.println("account number " + acc.getAccno());
		System.out.println("holder name " + acc.getName());
		System.out.println("balnace " + acc.getBalance());
		System.out.println("Account type " + acc.getClass().getSimpleName());
		System.out.println("Transection");
		for (Transection transection : acc.getTransection()) {
			System.out.println(transection.getTransectionId());
			System.out.println(transection.getTransectionAmount());
			System.out.println(transection.getDateTime());
		}
	}
}
//
//Account[] aa = { new SavingAccount(102, "shikar singh", 3200000),
//		new CurrentAccount(101, "rohan sahu", 7000000), new CurrentAccount(103, "vineet", 788000),
//		new SavingAccount(104, "ramya", 3280000) };
//printDetails(aa);
//}
//
//private static void printDetails(Account[] acc) {
//
//for (Account account : acc) {
//	printDetails(account);
//}
//}
