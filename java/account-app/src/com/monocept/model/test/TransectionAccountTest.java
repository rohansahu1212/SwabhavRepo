package com.monocept.model.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.monocept.model.Account;

public class TransectionAccountTest {
	public static void main(String[] args) throws IOException {

		Account[] accounts = new Account[] { new Account(101, "Jitin", 5000), new Account(201, "Manish", 1200),
				new Account(301, "Dipak") };
		for (Account acc : accounts) {
			acc.deposit(2000);
			acc.withdraw(50);
		}
		System.out.println("--------------after withdrawl----------");

		FileOutputStream fout = new FileOutputStream("account.bin");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(accounts);

		out.flush();
		out.close();
		fout.close();
		System.out.println("Serialized");

	}
}
