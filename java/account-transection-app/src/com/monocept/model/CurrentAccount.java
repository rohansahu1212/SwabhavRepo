package com.monocept.model;

public class CurrentAccount extends Account {

	public CurrentAccount(int accno, String name, double balance) {
		super(accno, name, balance);
	}

	@Override
	public void withDraw(double amt) {

		if (this.balance - amt > -10000)
			this.balance = this.balance - amt;
	}

}
