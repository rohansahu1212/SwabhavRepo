package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private double deptNumber;
	private String name;
	private String location;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<Employee> employees;

	public Department() {

	}

	public Department(double deptNumber, String name, String location) {
		super();
		this.deptNumber = deptNumber;
		this.name = name;
		this.location = location;
		employees = new ArrayList<Employee>();
	}

	public double getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(double deptNumber) {
		this.deptNumber = deptNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptNumber=" + deptNumber + ", name=" + name + ", location=" + location + "]";
	}
   public void addEmployeeList(Employee employee) {
	   employees.add(employee);
   }
}
