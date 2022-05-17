package com.monocept.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Employee {
	@Id
	private int empno;
	private String name;
	@ManyToOne
	@JoinColumn
	private Department dept;
	
	
	public Employee() {
		super();
	}


	public Employee(int empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	
	}


	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Department getDept() {
		return dept;
	}


	public void setDept(Department dept) {
		this.dept = dept;
	}
	
}
