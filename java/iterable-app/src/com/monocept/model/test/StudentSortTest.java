package com.monocept.model.test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import com.monocept.model.SortByCgpaStrategy;
import com.monocept.model.SortByFirstNameStrategy;
import com.monocept.model.SortByLastNameStrategy;
import com.monocept.model.Student;
import com.monocept.model.test.StudentTest;

public class StudentSortTest {
	public static void main(String[] args) {

		Set<Student> studentSet1 = new TreeSet<Student>(new SortByFirstNameStrategy());
//	studentSet = new HashSet<Student>();

		studentSet1.add(new Student("ramya", "akkula", 12, 9.5, 10));
		studentSet1.add(new Student("ramya", "akkula", 12, 9.5, 10));
		studentSet1.add(new Student("abhishek", "shkula", 13, 9.5, 10));
		studentSet1.add(new Student("ankit", "shkula", 13, 9.5, 10));
		studentSet1.add(new Student("vijay", "shkula", 13, 9.5, 10));

		System.out.println("sorting according to first name--------------------");
		StudentTest.printDetails(studentSet1);

		Set<Student> studentSet2 = new TreeSet<Student>(new SortByLastNameStrategy());

		studentSet2.add(new Student("ramya", "akkula", 12, 9.5, 10));
		studentSet2.add(new Student("ramya", "akkula", 12, 9.5, 10));
		studentSet2.add(new Student("abhishek", "shukla", 13, 9.5, 10));
		studentSet2.add(new Student("ankit", "shukla", 13, 9.5, 10));
		studentSet2.add(new Student("vijay", "zhukla", 13, 9.5, 10));

		System.out.println("sorting according to last name----------------");
		StudentTest.printDetails(studentSet2);

		Set<Student> studentSet3 = new TreeSet<Student>( new SortByCgpaStrategy());

		studentSet3.add(new Student("ramya", "akkula", 12, 9.5, 10));
		studentSet3.add(new Student("ramya", "akkula", 12, 9.5, 10));
		studentSet3.add(new Student("abhishek", "shukla", 13, 9.5, 10));
		studentSet3.add(new Student("ankit", "shukla", 13, 9.5, 10));
		studentSet3.add(new Student("vijay", "zhukla", 13, 9.5, 10));

		System.out.println("sorting according to cgpa" + "----------------");
		StudentTest.printDetails(studentSet3);

	}
}
