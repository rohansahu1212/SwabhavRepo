package com.monocept.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentService {
	private  List<Student> students;
	private static StudentService stud=null;
	
	private StudentService() {
		
		students = new  ArrayList<Student>();
		students.add(new Student("rohan", "sahu", 42, 8.6));
		students.add(new Student("ankit", "ram", 43, 8.6));
		students.add(new Student("vijay", "omar", 44, 8.6));
		students.add(new Student("ankit", "singh", 45, 8.6));
		students.add(new Student("dhanush", "katiyar", 46, 8.6));
		
		
	}
	public void addStudent(Student student) {
		students.add(student);
		System.out.println("student added");
	}

	public List<Student> getStudents(){
		return students;
	}
	public static StudentService getObject() {
		if(stud==null)
			stud= new StudentService();
		return stud;
		
	}
	

}
