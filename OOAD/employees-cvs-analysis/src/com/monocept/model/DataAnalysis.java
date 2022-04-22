package com.monocept.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import org.junit.runner.Computer;

public class DataAnalysis {
	public HashSet<Employee> employees = new HashSet<Employee>();
	private ImportData source;
	
	public HashSet<Employee> getEmployee(){
		getData();
		return employees;
	}

	public DataAnalysis(ImportData source) {
		this.source = source;
	}

	public void getData() {

		employees = source.readContent();

	}

	public Employee findCeo() {
		getData(); // adding data
		for (Employee emp : employees) {
			if (emp.getJobId().contains("NULL"))
				return emp;
		}

		return null;

	}

	public HashMap<String, Integer> jobWiseCount() {
		HashMap<String, Integer> employeeCounts = new HashMap<String, Integer>();
		getData(); // adding data
		for (Employee emp : employees) {
			if (!employeeCounts.containsKey(emp.getJob()))
				employeeCounts.put(emp.getJob(), 0);
			employeeCounts.put(emp.getJob(), employeeCounts.get(emp.getJob()) + 1);
		}

		return employeeCounts;
	}
}
