package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

@RestController
@RequestMapping(path = "/api/vi/student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	@PostMapping(path = "add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		service.addStudent(student);
		
		return ResponseEntity.ok(student);
	}
	@GetMapping(path="/all")
	public ResponseEntity<List<Student>> getAll(){
		List<Student> students=  service.getAll();
	  return ResponseEntity.ok(students);
	}
}
