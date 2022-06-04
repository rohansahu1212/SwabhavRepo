package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Employee;
import com.monocept.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	public EmployeeService() {
		System.out.println("employee serivce created");
	}

	public List<Employee> getEmployee() {
		return empRepo.getEmployees();
	}

	public void addEmployee(Employee employee) {
		empRepo.addEmployee(employee);
	}

}
