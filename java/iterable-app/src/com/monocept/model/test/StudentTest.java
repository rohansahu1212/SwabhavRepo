package com.monocept.model.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.monocept.model.Student;

public class StudentTest {
	public static void main(String[] args) {

		List<Student> studentList;
		// studentList = new ArrayList<Student>();
		studentList = new LinkedList<Student>();
		studentList.add(new Student("rohan", "sahu", 12, 8.5, 10));
		studentList.add(new Student("rohan", "sahu", 12, 8.5, 10));

		printDetails(studentList);

		Set<Student> studentSet;
//		studentSet = new HashSet<Student>();
		studentSet = new TreeSet<Student>();
		studentSet.add(new Student("ramya", "akkula", 12, 9.5, 10));
		studentSet.add(new Student("ramya", "akkula", 12, 9.5, 10));
		studentSet.add(new Student("abhishek", "shkula", 13, 9.5, 10));
		studentSet.add(new Student("ankit", "shkula", 13, 9.5, 10));
		studentSet.add(new Student("vijay", "shkula", 13, 9.5, 10));

		printDetails(studentSet);
	}

	public static void printDetails(Iterable<Student> students) {
		for (Student student : students) {
			System.out.println("First Name "+student.getFirstName());
			System.out.println("last name "+student.getLastName());
			System.out.println("roll number "+student.getRollNo());
			System.out.println("CGPA "+student.getCgpa());
			System.out.println("standard "+student.getStandard());
			System.out.println("-----------------------------------");
		}
	}
}
