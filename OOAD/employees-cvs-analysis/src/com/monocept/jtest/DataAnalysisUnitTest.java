package com.monocept.jtest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import com.monocept.model.DataAnalysis;
import com.monocept.model.Employee;
import com.monocept.model.ImportDataFromUrl;

class DataAnalysisUnitTest {

	@Test
	void findCeoTest() {
		DataAnalysis dataAnalysis = new DataAnalysis(new ImportDataFromUrl());
		Employee emp = dataAnalysis.findCeo();
		String name = emp.getEmployeeName();
		assertTrue(name.contains("KING-WEB"));
		assertTrue(emp.getJobId().contains("NULL"));
	}
	@Test
	void jobWiseCountCheck() {
		DataAnalysis dataAnalysis = new DataAnalysis(new ImportDataFromUrl());
		HashMap<String, Integer> employeesCountByJob = dataAnalysis.jobWiseCount();
		assertEquals(employeesCountByJob.get("'PRESIDENT'"),1);
		assertEquals(employeesCountByJob.get("'SALESMAN'"),4);
		assertEquals(employeesCountByJob.get("'MANAGER'"),3);
		assertEquals(employeesCountByJob.get("'CLERK'"),4);
		assertEquals(employeesCountByJob.get("'ANALYST'"),2);
	}
}
