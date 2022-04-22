package com.monocept.model;

public class SavingAccount extends Account {

	public SavingAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public void withDraw(double amt) {
		if (this.balance - amt > BankRule.minBalance)
			this.balance = this.balance - amt;

	}

}
