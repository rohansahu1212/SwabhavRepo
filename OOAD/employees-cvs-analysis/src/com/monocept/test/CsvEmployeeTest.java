package com.monocept.test;

import java.util.HashMap;
import java.util.HashSet;

import com.monocept.model.DataAnalysis;
import com.monocept.model.Employee;
import com.monocept.model.ImportDataFromFile;
import com.monocept.model.ImportDataFromUrl;

public class CsvEmployeeTest {
	public static void main(String[] args) {
		DataAnalysis da = new DataAnalysis(new ImportDataFromUrl());
		System.out.println("reading from a url");
		Employee emp = da.findCeo();
		System.out.println("name of ceo " + emp.getEmployeeName());
		System.out.println("Salary of ceo " + emp.getSalary());

		HashMap<String, Integer> employeesCountByJob = da.jobWiseCount();
		for (String key : employeesCountByJob.keySet()) {
			System.out.println(key + " = " + employeesCountByJob.get(key));

		}
		System.out.println();
		System.out.println();

		DataAnalysis daf = new DataAnalysis(new ImportDataFromFile());
		Employee empf = daf.findCeo();
		System.out.println("reading from a file");
		System.out.println("name of ceo " + empf.getEmployeeName());
		System.out.println("Salary of ceo " + empf.getSalary());

		HashMap<String, Integer> employeesCountByJobf = daf.jobWiseCount();
		for (String key : employeesCountByJobf.keySet()) {
			System.out.println(key + " = " + employeesCountByJobf.get(key));

		}
		
		CsvEmployeeTest cs= new CsvEmployeeTest();
		cs.myDeatils();
	}
	public void myDeatils() {
		DataAnalysis da= new DataAnalysis(new ImportDataFromUrl());
		HashSet<Employee> emp=da.getEmployee();
		for( Employee em:emp)
			System.out.println(em.getEmployeeName());
	}
}
