package com.monocept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.repository.StudentRepository;

@Service("studentSvc")
public class StudentService {
	@Autowired
	private StudentRepository repo = null;

	public StudentService() {
		System.out.println("Student Service Created");
	}
	
	public int count() {
		return repo.getStudents().size();
	}
	
	
}
