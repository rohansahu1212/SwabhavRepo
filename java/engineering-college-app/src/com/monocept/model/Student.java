package com.monocept.model;

public class Student extends PersonDetails {
	
	public Student(String name, String dob, int id,String branch) {
		super(name, dob, id);
		this.branch=branch;
	}
	public void details() {
		System.out.println("Student Branch : "+this.branch);
	}
}
