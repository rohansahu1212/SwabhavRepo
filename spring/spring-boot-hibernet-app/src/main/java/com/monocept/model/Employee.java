package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {


	@Id
	private int empNumber;
	private String name;
	private double salary;

	@ManyToOne
	@JoinColumn
	private Department department;

	public Employee() {

	}

	public Employee(int empNumber, String name, double salary) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", salary=" + salary + "]";
	}

}
