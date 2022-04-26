package com.monocept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class WithTxnTest {
	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/transection?useSSL=false&serverTimezone=UTC", "root", "root");
		connection.setAutoCommit(false);

		Boolean bool = true;
		Statement stmt = connection.createStatement();
		int count1 = stmt.executeUpdate("UPDATE customer SET balance = balance-500 WHERE id=2;");
		bool = check(count1);
		int count2 = stmt.executeUpdate("UPDATE merchant SET balance = balance+500 WHERE id=2;");
		bool = check(count2);
		if (bool == true) {
			connection.commit();
			System.out.println("changes made");
		}
	}

	static Boolean check(int num) {
		if (num == 0)
			return false;
		return true;
	}

}
