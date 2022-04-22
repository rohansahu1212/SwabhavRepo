package com.monocept.model;

public class Account {
	private final int accno;
	private final String name;
	private double balance;
	public double withdraAmount;

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
		withdraAmount=this.balance - amt;
		if (this.balance - amt > BankRule.minBalance)
			this.balance = this.balance - amt;
		Account acc=this;
		if (this.balance - amt < BankRule.minBalance)
			throw new InsufficientFundException(acc);

	}

	public String getName() {
		return this.name;
	}

	public int getAccno() {
		return this.accno;
	}

	public Double getBalance() {
		return this.balance;
	}
}
