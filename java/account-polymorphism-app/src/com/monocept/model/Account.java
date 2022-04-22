package com.monocept.model;

public abstract class Account {
	private final int accno;
	private final String name;
	protected double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amt) {
		this.balance += amt;
	}

	public abstract void withDraw(double amt);

	public String getName() {
		return this.name;
	}

	public int getAccno() {
		return this.accno;
	}
	public double getBalance() {
		return this.balance;
	}
}
