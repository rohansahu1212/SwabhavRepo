package com.monocept.model;

import java.io.IOException;

public abstract class Employee {
	private int employeeNumber;
	private String employeeName;
	private  double basic;
    
	public Employee(int employeeNumber,String employeeName, double basic)
	{
		this.employeeNumber=employeeNumber;
		this.employeeName=employeeName;
		this.basic=basic;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public double getBasic(){
		return basic;
	}
	public abstract double calcAnnualCTC();
	public abstract String getOtherSalary();
	//public abstract void salary() throws IOException;
	
}
