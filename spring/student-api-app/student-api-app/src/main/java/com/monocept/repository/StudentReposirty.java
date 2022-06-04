package com.monocept.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.monocept.model.Student;
@Repository
public class StudentReposirty {
	
	
	public StudentReposirty() {
		System.out.println("student repo created");
		students = new ArrayList<Student>();
		students.add(new Student("rohan", "sahu", 42, 8.6));
		students.add(new Student("ankit", "ram", 43, 8.6));
		students.add(new Student("vijay", "omar", 44, 8.6));
		students.add(new Student("ankit", "singh", 45, 8.6));
		students.add(new Student("dhanush", "katiyar", 46, 8.6));
	}
	private List<Student> students;

	public List<Student> get() {
		
		return students;
	}
	
	public Student getSingle(int id) {
		for (Student std : students) {
			System.out.println(std.getRollNo());
			if (id == std.getRollNo())
				return std;
		}
		return null;
	}
	
	public void updateStudent(int id, Student student) {
		Student originalStudet= getSingle(id);
		originalStudet.setFirstName(student.getFirstName());
		originalStudet.setCgpa(student.getCgpa());
	}
	public void addStudent(Student student) {
		students.add(student);
	}
}
