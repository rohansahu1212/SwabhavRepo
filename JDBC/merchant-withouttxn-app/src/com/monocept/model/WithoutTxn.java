package com.monocept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WithoutTxn {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/transection?useSSL=false&serverTimezone=UTC", "root", "root");
	
	

		Statement stmt = connection.createStatement();
		int count1=stmt.executeUpdate("UPDATE customer SET balance = balance-500 WHERE id=2;");
		int count2=stmt.executeUpdate("UPDATE merchant SET balance = balance+500 WHERE id=9;"); //id 9 is not there 
		System.out.println(count1+"     "+count2);
		
	}
}
