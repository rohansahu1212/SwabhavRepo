package com.monocept.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	final private int accountNumber;
	final private String Name;
	private double balance;
	private List<Notifier> notifiers;

	public Account(int accountNumber, String name, double balance) {

		this.accountNumber = accountNumber;
		Name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<Notifier>();
	}

	public void deposite(double amt) {
		this.balance += amt;
		sendNotification();
	}

	public void withDrawl(double amt) {
		if (balance - amt > 500) {
			balance -= amt;
			sendNotification();
		} else
			System.out.println("transection failed due to insufficient fund");
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return Name;
	}

	public double getBalance() {
		return balance;
	}

	public List<Notifier> getNotifiers() {
		return notifiers;
	}

	public void registerNotifier(Notifier noti) {
		notifiers.add(noti);
	}
	public void sendNotification() {
		for(Notifier noti:notifiers)
			noti.notify(this);
	}


}
