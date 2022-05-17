package com.monocept.model.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Student;

public class StudentTest {
	public static void main(String[] args) {

		StudentTest st = new StudentTest();
		st.getStudent(7);
		st.displayAll();
		st.deleteStudent(1);
	}

	private void addStudent() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory facotry = cfg.configure().buildSessionFactory();
		System.out.println(facotry.getClass());

		Session session = facotry.openSession();
		System.out.println(session.getClass());

//	Student vineet = new Student(3, "rohan", 9.8);
		Student nikhil = new Student(7, "shitik khan", 9.8);

		Transaction txn = session.beginTransaction();
		System.out.println(txn.getClass());

		try {
			session.saveOrUpdate(nikhil);
			// session.save(vineet);
			txn.commit();
		} catch (Exception e) {
			System.out.println("  error msg      " + e);
			txn.rollback();
		} finally {
			if (session.isOpen())
				session.close();
		}
	}

	private void getStudent(int id) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory facotry = cfg.configure().buildSessionFactory();
		System.out.println(facotry.getClass());

		Session session = facotry.openSession();
		System.out.println(session.getClass());

//		Student vineet = new Student(3, "rohan", 9.8);
		Student nikhil = new Student(7, "shitik khan", 9.8);

		Transaction txn = session.beginTransaction();
		System.out.println(txn.getClass());

		try {
			Student student = (Student) session.get(Student.class, id);
			// session.save(vineet);
			System.out.println(student.getName() + " record found at " + id);
			txn.commit();
		} catch (Exception e) {
			System.out.println("  error msg  in display    " + e);
			txn.rollback();
		} finally {
			if (session.isOpen())
				session.close();
		}

	}

	private void displayAll() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory facotry = cfg.configure().buildSessionFactory();
		System.out.println(facotry.getClass());

		Session session = facotry.openSession();
		System.out.println(session.getClass());

//		Student vineet = new Student(3, "rohan", 9.8);
		Student nikhil = new Student(7, "shitik khan", 9.8);

		Transaction txn = session.beginTransaction();
		System.out.println(txn.getClass());

		try {
			List<Student> students = session.createQuery("from Student").list();
			// session.save(vineet);
			for (Student std : students)
				System.out.println(std.getName() + " " + std.getCgpa());
			txn.commit();
		} catch (Exception e) {
			System.out.println("  error msg  in dsiplay all    " + e);
			txn.rollback();
		} finally {
			if (session.isOpen())
				session.close();
		}

	}

	private void deleteStudent(int id) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory facotry = cfg.configure().buildSessionFactory();
		System.out.println(facotry.getClass());

		Session session = facotry.openSession();
		System.out.println(session.getClass());

//	Student vineet = new Student(3, "rohan", 9.8);
		Student nikhil = new Student(7, "shitik khan", 9.8);

		Transaction txn = session.beginTransaction();
		System.out.println(txn.getClass());

		try {
			Student student = (Student) session.get(Student.class, id);
			// session.save(vineet);
			session.delete(student);
			txn.commit();
			System.out.println("student deleted");
		} catch (Exception e) {
			System.out.println("  error msg  in display    " + e);
			txn.rollback();
		} finally {
			if (session.isOpen())
				session.close();
		}

	}
}
