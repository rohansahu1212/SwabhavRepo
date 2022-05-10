package com.monocept.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentList {
	List<Student> students;
	
	public StudentList() {
		
		students = new  ArrayList<Student>();
		students.add(new Student("rohan", "sahu", 42, 8.6));
		students.add(new Student("ankit", "ram", 43, 8.6));
		students.add(new Student("vijay", "omar", 44, 8.6));
		students.add(new Student("ankit", "singh", 45, 8.6));
		students.add(new Student("dhanush", "katiyar", 46, 8.6));
		
		
	}

	public List<Student> getStudents(){
		return students;
	}

}
