package com.monocept.model;

public abstract class PersonDetails {
	private int id;
	private String name;
	private String dob;
	protected String branch = "";
	protected double salary = 0.0;

	PersonDetails(String name,String dob,int id) {
	this.name=name;
	this.id=id;
	this.dob=dob;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public int getId() {
		return id;
	}
  public abstract void details();
}
