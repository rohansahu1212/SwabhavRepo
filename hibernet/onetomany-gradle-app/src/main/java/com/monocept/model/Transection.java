package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transection {
	@Id
	private int id;
	private String type;
	private double amount;
	@ManyToOne
	@JoinColumn
	private Account account;
	public Transection() {
		super();
	}

	public Transection(int id, String type, double balance) {
		super();
		this.id = id;
		this.type = type;
		this.amount = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return amount;
	}

	public void setBalance(double balance) {
		this.amount = balance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
