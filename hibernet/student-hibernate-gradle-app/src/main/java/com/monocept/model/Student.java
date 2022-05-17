package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private double cgpa;
	

	public Student() {
		super();
	}

	public Student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

}
