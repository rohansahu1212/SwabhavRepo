package com.monocept.jtest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.monocept.model.Employee;
import com.monocept.model.ImportData;
import com.monocept.model.ImportDataFromUrl;

class ImportUnitTest {

	@Test
	void isUrlCorrect() {

		ImportData id = new ImportDataFromUrl();
		String acutalUrlAddress = "https://swabhav-tech.firebaseapp.com/emp.txt";
		String expectedUrlAddress = "https://swabhav-tech.firebaseapp.com/emp.txt";

		assertTrue(acutalUrlAddress == expectedUrlAddress);
	}

	@Test
	void isDataImportingProperly() {
		ImportData id = new ImportDataFromUrl();
		String acutalUrlAddress = "https://swabhav-tech.firebaseapp.com/emp.txt";
		HashSet<Employee> employees = new HashSet<Employee>();
		int beforeAddingData = employees.size();
		employees = id.readContent();
		int afterAddingData = employees.size();
		assertFalse(beforeAddingData == afterAddingData);
	}

	@Test
	void isDublicayRemoveByEmployeeWorkForce() {
		int expectedEmployeeStrenght = 14;
		ImportData id = new ImportDataFromUrl();
		String acutalUrlAddress = "https://swabhav-tech.firebaseapp.com/emp.txt";
		HashSet<Employee> employees = new HashSet<Employee>();
		employees = id.readContent();
		int actualEmployeeStrenght = employees.size();
		assertTrue(actualEmployeeStrenght == expectedEmployeeStrenght);
	}
}
