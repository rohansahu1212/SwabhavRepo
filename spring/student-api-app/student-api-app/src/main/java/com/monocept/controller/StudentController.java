package com.monocept.controller;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

@RequestMapping("/api/v1/student")
@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	public StudentController() {
		System.out.println("inside student controller ");
		System.out.println(studentService);
	}

	@GetMapping(path = "/all")
	public ResponseEntity<List<Student>> getAll() {
		System.out.println(studentService + "  student service object");
		return ResponseEntity.ok(studentService.getStudents());
	}

	@GetMapping(path = "/single/{rollNo}")
	public ResponseEntity<Student> getSingle(@PathVariable("rollNo") String id) {
		System.out.println("single student " + id);
		return ResponseEntity.ok(studentService.getSingle(Integer.valueOf(id)));

	}

	@PostMapping(path = "/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		System.out.println(student.getFirstName());
		System.out.println(student.getRollNo());
		studentService.addStudent(student);
		System.out.println("in add method");
		return ResponseEntity.ok(student);
	}
	@PutMapping(path = "/edit/{rollNo}")
	public ResponseEntity<Student> editStudent(@PathVariable("rollNo") String rollNo,@RequestBody Student student) {
	
		studentService.updateStudent(Integer.valueOf(rollNo), student);
		return ResponseEntity.ok(studentService.getSingle(Integer.valueOf(rollNo)));
	}

	

}
