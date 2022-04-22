package com.monocept.model;

public class Account {
	private final int accno;
	private final String name;
	private double balance;

	public Account(int accno, String name) {
		this(accno, name, BankRule.minBalance);

	}

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
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

	public double getBalance() {
		return this.balance;
	}

	@Override
	public String toString() {
		return accno + "\n " + name + "\n " + balance + "\n " + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		Account acc = (Account) obj;
		// System.out.println("hey here");
		return (name == acc.name && accno == acc.accno && balance == acc.balance);
		/*
		 * if(this.name != acc.name) return false; if(this.accno != acc.accno) return
		 * false; if(this.balance!=acc.balance) return false; return true; }
		 */

	}
}
