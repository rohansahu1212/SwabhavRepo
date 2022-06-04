package com.monocept.controller;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
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

	@PostMapping(path = "/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		System.out.println(student.getFirstName());
		System.out.println(student.getRollNo());
		studentService.addStudent(student);
		System.out.println("in add method");
		return ResponseEntity.ok(student);
	}

	@PutMapping(path = "/edit")
	public ResponseEntity<Student> editStudent(@RequestBody Student student) {
		studentService.editStudent(student);
		return ResponseEntity.ok(student);
	}

	@DeleteMapping(path = "/delete/{rollNo}")
	public String editStudent(@PathVariable("rollNo") String rollNo) {
		System.out.println(rollNo);
		studentService.deleteStudent(Integer.valueOf(rollNo));
		return rollNo;
	}

}
