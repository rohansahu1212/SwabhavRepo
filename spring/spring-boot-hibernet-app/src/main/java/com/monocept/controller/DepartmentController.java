package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Department;
import com.monocept.model.Student;
import com.monocept.service.DepartmentService;

@RestController
@RequestMapping(path = "/api/v1/department")
public class DepartmentController {
	@Autowired
	private DepartmentService deptService;

	DepartmentController() {
		System.out.println("in deparment controller");
	}

	@GetMapping(path = "/all")
	public ResponseEntity<List<Department>> getAllDepartment() {
		return ResponseEntity.ok(deptService.getDepartment());
	}

	@PostMapping(path = "/add")
	public ResponseEntity<Department> addDepartment(@RequestBody Department department){
		deptService.addDepartment(department);
		return ResponseEntity.ok(department);
	}

}
