package com.monocept.model;

import java.io.Serializable;

public class Account implements Serializable{
	private final int accno;
	private final String name;
	private Double balance;

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

	public Double getBalance() {
		return this.balance;
	}
}
