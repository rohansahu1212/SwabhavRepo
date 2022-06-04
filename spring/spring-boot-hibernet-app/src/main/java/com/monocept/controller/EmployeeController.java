package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Employee;
import com.monocept.service.EmployeeService;

@RestController
@RequestMapping(path = "/api/v2/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	EmployeeController() {
		System.out.println("In Employee controller");
	}

	@GetMapping(path = "/all")
	public ResponseEntity<List<Employee>> allEmployee() {
		return ResponseEntity.ok(empService.getEmployee());
	}


	@PostMapping(path = "/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		empService.addEmployee(employee);
		return ResponseEntity.ok(employee);
	}
}
