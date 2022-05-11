package com.monocept.test;

import java.sql.SQLException;

public class CrudOperationTest {
	public static void main(String[] args) throws SQLException {

		CrudOperations ct = new CrudOperations();
		// ct.dataEnter(71, "vijay");
		ct.dataAlter(2, "ankit uadav");
		ct.display();
	}
}
