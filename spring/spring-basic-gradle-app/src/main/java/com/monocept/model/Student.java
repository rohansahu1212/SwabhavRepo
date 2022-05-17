package com.monocept.model;

public class Student {
	private int rollNo;
	private String name;
	private double cgpa;

	public Student() {

	}

	public Student(int rollNo, String name, double cgpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

}
