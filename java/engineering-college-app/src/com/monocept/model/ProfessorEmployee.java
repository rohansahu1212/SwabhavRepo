package com.monocept.model;

public class ProfessorEmployee extends PersonDetails {
	double annualSalary;

	public ProfessorEmployee(String name, String dob, int id, double salary) {
		super(name, dob, id);
		this.salary = salary;
	}

	public double getSalary() {
		annualSalary = (salary + (20.0 / 100.00) * salary) * 12;
		return annualSalary;
	}

	public void details() {
		System.out.println("salary is equal to " + getSalary());
	}

}
