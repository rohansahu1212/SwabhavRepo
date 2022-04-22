package com.monocept.model;

public class Account {
	private final int accno;
	private final String name;
	private Double balance;
	private static int counter ;
	static {
		counter=100;
		System.out.println("inside static block");
	}

	public Account(int accno, String name) {
		this(accno, name, BankRule.minBalance);

	}

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		counter++;
		System.out.println("inside constructor");
	}

	public void deposit(double amt) {
		this.balance += amt;
	}

	public void withdraw(double amt) {
		if (this.balance - amt > BankRule.minBalance)
			this.balance = this.balance - amt;

	}

	public String getName() {
		return this.name;
	}

	public int getAccno() {
		return this.accno;
	}

	public int getCount() {
		return this.counter;
	}
	public static int headCount() {
		return counter;
	}

	public Double getBalance() {
		return this.balance;
	}
}
