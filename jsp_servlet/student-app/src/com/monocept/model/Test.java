package com.monocept.model;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> auth=StudentService.getObject().getStudents();
		for(Student std:auth)
			System.out.println(43==std.getRollNo());
	}
}
