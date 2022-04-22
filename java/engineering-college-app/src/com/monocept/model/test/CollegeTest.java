package com.monocept.model.test;

import com.monocept.model.PersonDetails;
import com.monocept.model.ProfessorEmployee;
import com.monocept.model.Student;

public class CollegeTest {
	public static void main(String[] args) {
		Student s1=new Student("rohan","12/12/1997",102,"computer science");
		printDeatils(s1);
		ProfessorEmployee p1=new ProfessorEmployee("rk jaiswal","12/2/1981", 106, 3700.0);
		printDeatils(p1);
		
	}

	private static void printDeatils(PersonDetails obj) {
		System.out.println("Name : " + obj.getName());
		System.out.println("Date of birth : " + obj.getDob());
		System.out.println("Id is : " + obj.getId());
		obj.details();
		System.out.println("----------------------------------\n");
		
	}
}
