package com.monocept.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Student;
import com.monocept.repository.IstudentCRUDRepository;
@Service
public class StudentService {

	@Autowired
	IstudentCRUDRepository repo;

	public StudentService() {

	}

	public List<Student> getAll() {
		List<Student> students = new ArrayList<Student>();
		repo.findAll().forEach(s -> {
			students.add(s);
		});
		return students;
	}
	
	public int addStudent(Student student) {
		Student storeStudent= repo.save(student);
		return storeStudent.getId();
	}
}
