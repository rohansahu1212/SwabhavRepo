package com.monocept.model.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.monocept.model.Account;

public class DeserializedTest {
	public static void main(String[] args) throws Exception {

		FileInputStream fin = new FileInputStream("account.bin");
		ObjectInputStream ois = new ObjectInputStream(fin);
		Account[] acc = (Account[]) ois.readObject();
		printDetails(acc);
		fin.close();
		ois.close();
	}

	private static void printDetails(Account[] acc) {
		for (Account ac : acc) {
			System.out.println("Name of holder " + ac.getName());
			System.out.println("Account number is " + ac.getAccno());
			System.out.println("Balance is " + ac.getBalance());
		}

	}
}
