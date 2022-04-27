package com.monocept.middle;

public class UserData {
	private int id;
	private String name;
	private String password;
	private String email;
	private double balance;
    
	
	public UserData(int id, String name, String password, String email, double balance) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", balance="
				+ balance + "]";
	}

}
