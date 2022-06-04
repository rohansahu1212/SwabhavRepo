package com.monocept.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.monocept.model.Student;
import com.monocept.repositor.StudentRepository;

public class StudentService {
	private List<Student> students;
	private static StudentService stud = null;

	private StudentService() {

	}

	public List<Student> getStudents() {
		students = new StudentRepository().getStudents(0, 5);
		return students;
	}
	public List<Student> getStudents(int startIndex, int size) {
		students = new StudentRepository().getStudents(startIndex,size);
		return students;
	}


	public static StudentService getObject() {
		if (stud == null)
			stud = new StudentService();
		return stud;

	}

}
