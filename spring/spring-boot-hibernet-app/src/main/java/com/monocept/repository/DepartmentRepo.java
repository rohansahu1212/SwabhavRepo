package com.monocept.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Department;

@Repository
public class DepartmentRepo {

	@PersistenceContext
	private EntityManager em;

	public DepartmentRepo() {
		System.out.println("department is created");
	}

	public List<Department> getDepartment() {
		return em.createQuery("from Department").getResultList();
	}

	@Transactional
	public void addDepartment(Department dept) {
		em.persist(dept);
	}

}
