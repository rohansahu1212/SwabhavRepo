package com.monocept.model;

public class User {
	private int loginId;
	private String password;
	private String name;
	private String email;
	private Boolean isActive;

	public User(int loginId, String password, String name, String email, Boolean isActive) {
		this.loginId = loginId;
		this.password = password;
		this.name = name;
		this.email = email;
		this.isActive = isActive;
	}

	public int getLoginId() {
		return loginId;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Boolean getIsActive() {
		return isActive;
	}


	

}
