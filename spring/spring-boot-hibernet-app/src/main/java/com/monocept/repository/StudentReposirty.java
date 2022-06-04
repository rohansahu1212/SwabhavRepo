package com.monocept.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.monocept.model.Student;

@Repository
public class StudentReposirty {

	@PersistenceContext
	private EntityManager em;

	public StudentReposirty() {
		System.out.println("student repo created");
	}

	public List<Student> get() {

		return em.createQuery("from Student").getResultList();
	}

	@Transactional
	public void addStudent(Student student) {
		em.persist(student);
	}

	@Transactional
	public void editStudent(Student changeStudent) {
		Student originalStudent = (Student) em
				.createQuery("from Student where roll_no = " + changeStudent.getRollNo() + " ").getSingleResult();
		System.out.println(originalStudent.toString());
		originalStudent.setFirstName(changeStudent.getFirstName());
		originalStudent.setLastName(changeStudent.getLastName());
		originalStudent.setCgpa(changeStudent.getCgpa());
		em.merge(originalStudent);

	}
	@Transactional
	public void deleteStudent(int rollNo) {
		Student originalStudent = (Student) em
				.createQuery("from Student where roll_no = " + rollNo + " ").getSingleResult();
		em.remove(originalStudent);
		
	}
	
	
	
}
