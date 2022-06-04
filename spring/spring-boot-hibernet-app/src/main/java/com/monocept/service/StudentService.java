package com.monocept.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Student;
import com.monocept.repository.StudentReposirty;

@Service
public class StudentService {
	@Autowired
	private StudentReposirty studentRepository;

	public StudentService() {
		System.out.println("student service created");

	}

	public List<Student> getStudents() {

		return studentRepository.get();
	}

	public void editStudent(Student student) {
		studentRepository.editStudent(student);
	}

	public void addStudent(Student student) {
		studentRepository.addStudent(student);
	}

	public void deleteStudent(int rollNo) {
		studentRepository.deleteStudent(rollNo);
	}

}
