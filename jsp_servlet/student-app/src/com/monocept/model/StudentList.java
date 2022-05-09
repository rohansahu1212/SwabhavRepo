package com.monocept.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentList {
	List<String > students;
	
	public StudentList() {
		
		students = new  ArrayList<String>();
		
		students.add("Rohan sahu");
		students.add("vijay chuahan");
		students.add("Ankit pandey");
		students.add("alia bhatt");
		students.add("Kangna ranaout");
		students.add("Ajay devgan");
	}

	public List<String> getStudents(){
		return students;
	}

}
