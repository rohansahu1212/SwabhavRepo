package com.monocept.model;

public class Student {
	private String firstName;
	private String lastName;
	private int rollNo;
	private double cgpa;

	public Student(String firstName, String lastName, int rollNo, double cgpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	

}
