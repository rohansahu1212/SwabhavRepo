package com.monocept.model;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.Map;

import java.util.TreeMap;

public class MapOperation {
	public static void main(String[] args) {

		Student s1 = new Student("ramyaaa", "akkula", 12, 9.5, 10);
		Student s2 = new Student("abhishek", "shkula", 13, 8.5, 10);
		Student s3 = new Student("ankit", "shkula", 14, 7.5, 10);
		Student s4 = new Student("vijay", "sahu", 16, 7.5, 10);
		Student s5 = new Student("vijay", "shkula", 16, 9.5, 10); //
		Student s6 = new Student("vijay", "khan", 16, 9.5, 10); // this have same name and roll no as s5 object
																// so it won't be added
		Student s7 = new Student("VIJAY", "gupta", 16, 9.5, 10); // this have same name and roll no as s5 object
																// so it won't be added
		Map<Student, Student> map = new HashMap<Student, Student>();
		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);
		map.put(s4, s4);
		map.put(s5, s5);
		map.put(s6, s6);
		map.put(s7, s7);
		System.out.println("HASHMAP PRINT DETAILS----------------------------");
		printDetails(map);

		Map<Student, Student> tmap = new TreeMap<Student, Student>();//new SortByRollNumber());
		tmap.put(s1, s1);
		tmap.put(s2, s2);
		tmap.put(s3, s3);
		tmap.put(s4, s4);
		tmap.put(s5, s5);
		tmap.put(s6, s6);
		tmap.put(s7, s7);
		System.out.println("TREEMAP PRINT DETAILS----------------------------");
		printDetails(tmap);
		System.out.println(tmap);
	}
	public static void printDetails(Map<Student, Student> map) {
		for (Student student : map.keySet()) {
			System.out.println("First Namess " + student.getFirstName());
			System.out.println("last name " + student.getLastName());
			System.out.println("roll number " + student.getRollNo());
			System.out.println("CGPA " + student.getCgpa());
			System.out.println("standard " + student.getStandard());
			System.out.println("-----------------------------------");
		}
	}
}