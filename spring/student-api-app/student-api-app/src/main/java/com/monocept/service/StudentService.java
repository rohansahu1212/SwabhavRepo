package com.monocept.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Service;

import com.monocept.model.Student;
import com.monocept.repository.StudentReposirty;

@Service
public class StudentService {
	
	StudentReposirty sr =new StudentReposirty();

	public StudentService() {
		System.out.println("student service created");

	}

	public List<Student> getStudents() {

		return sr.get();
	}

	public Student getSingle(int rollno) {
		return sr.getSingle(rollno);
	}
	public void updateStudent(int rollNo, Student student) {
		sr.updateStudent(rollNo, student);
	}

	public void addStudent(Student student) {
		sr.addStudent(student);
	}

}
