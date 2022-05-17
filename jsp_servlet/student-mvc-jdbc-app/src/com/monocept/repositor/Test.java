package com.monocept.repositor;

import java.util.List;

import com.monocept.model.Student;
import com.monocept.service.StudentService;

public class Test {
	public static void main(String[] args) {
	CourseReopository cr= new CourseReopository();
	cr.getCourses();
	
	System.out.println(StudentService.getObject().getStudents());
	}
}
