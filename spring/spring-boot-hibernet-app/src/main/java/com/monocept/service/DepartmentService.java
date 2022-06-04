package com.monocept.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.monocept.model.Department;
import com.monocept.repository.DepartmentRepo;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepo deptRepo;

	public List<Department> getDepartment() {
		return deptRepo.getDepartment();

	}

	public void addDepartment(Department dept) {
		deptRepo.addDepartment(dept);
	}

}
