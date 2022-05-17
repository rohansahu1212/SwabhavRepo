package com.monocept.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	private String username;
	private String pass;
	private double balance;
	@OneToMany(mappedBy = "account",cascade = CascadeType.ALL)
	private Set<Transection> transections;

	public Account() {
		super();
	}

	public Account(String username, String pass, double balance) {
		super();
		this.username = username;
		this.pass = pass;
		this.balance = balance;
		transections= new HashSet<Transection>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Set<Transection> getTransections() {
		return transections;
	}

	public void setTransections(Set<Transection> transections) {
		this.transections = transections;
	}

}
