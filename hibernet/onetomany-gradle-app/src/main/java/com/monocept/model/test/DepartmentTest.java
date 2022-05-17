package com.monocept.model.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Department;
import com.monocept.model.Employee;

public class DepartmentTest {
	public static void main(String[] args) {

		DepartmentTest dt = new DepartmentTest();

		dt.displayAll();

	}

	private void creatTable() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory facotry = cfg.configure().buildSessionFactory();
		System.out.println(facotry.getClass());

		Session session = facotry.openSession();
		System.out.println(session.getClass());

		Transaction txn = session.beginTransaction();
		System.out.println(txn.getClass());

		Department dept10 = new Department(101, "computer science");

		Employee emp1 = new Employee(1, "rohan");
		emp1.setDept(dept10);

		Employee emp2 = new Employee(2, "shikhar");
		emp2.setDept(dept10);

		Employee emp3 = new Employee(3, "ramya");
		emp3.setDept(dept10);

		Set<Employee> employees = new HashSet<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		dept10.setEmployees(employees);
		// session.beginTransaction();
		session.save(dept10);

		txn.commit();
	}

	private void displayAll() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory facotry = cfg.configure().buildSessionFactory();
		System.out.println(facotry.getClass());

		Session session = facotry.openSession();
		System.out.println(session.getClass());

		Transaction txn = session.beginTransaction();
		System.out.println(txn.getClass());
		try {
			List<Department> departments = session.createQuery("from Department").list();

			for (Department dpt : departments) {
				System.out.println(" ID: " + dpt.getId() + " Department Name: " + dpt.getName());
				for (Employee emp : dpt.getEmployees())
					System.out.println("Employee Name " + emp.getName() + " Employee id " + emp.getEmpno());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
