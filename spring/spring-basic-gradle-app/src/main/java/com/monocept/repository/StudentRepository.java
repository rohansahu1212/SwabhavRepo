package com.monocept.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.monocept.model.Student;
@Repository
public class StudentRepository {
	private List<Student> students;

	public StudentRepository() {
		System.out.println("student repo ctreated");
		students= new ArrayList<Student>();
	}

	public List<Student> getStudents() {
		students.add(new Student(12,"rohan", 7.6));
		students.add(new Student(13,"vijay", 7.6));
		students.add(new Student(14,"ankit", 7.6));
		students.add(new Student(15,"yash", 7.6));
		students.add(new Student(16,"rajat", 7.6));
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
