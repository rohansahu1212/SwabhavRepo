package com.monocept.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Department;
import com.monocept.model.Employee;

@Repository
public class EmployeeRepo {

	@PersistenceContext
	private EntityManager em;

	public EmployeeRepo() {
		System.out.println("employee repo created");
	}

	public List<Employee> getEmployees() {
		return em.createQuery("from Employee").getResultList();
	}
	
	@Transactional
	public void addEmployee(Employee employee) {
		Department dept = (Department) em.createQuery("from Department where dept_number = 10 ").getSingleResult();
		employee.setDepartment(dept);
		dept.addEmployeeList(employee);
		em.merge(dept);
	}
}
