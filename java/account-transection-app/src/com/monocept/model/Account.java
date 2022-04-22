package com.monocept.model;

import java.util.ArrayList;

import java.util.List;
import java.sql.Timestamp;
import java.util.Date;

public class Account {
	private final int accno;
	private final String name;
	protected double balance;
	private static int id = 101;

	private List<Transection> transections = new ArrayList<>();

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
//		Timestamp ts1 = Timestamp.valueOf("2022-18-03 09:01:15");
		transections.add(new Transection(id, amount,getDateTime()));
		id++;
	}
    public String getDateTime(){
    	Timestamp ts = new Timestamp(System.currentTimeMillis());
		Date date = new Date(ts.getTime());
		String dateTime = date.toLocaleString();
		return dateTime;
    }
	public void withDraw(double amount) {

		if (this.balance - amount > -10000)
			this.balance = this.balance - amount;
	
		transections.add(new Transection(id, amount, getDateTime()));
		id++;
	}

	public String getName() {
		return this.name;
	}

	public int getAccno() {
		return this.accno;
	}

	public List<Transection> getTransection() {
		return transections;
	}

	public double getBalance() {
		return this.balance;
	}
}
