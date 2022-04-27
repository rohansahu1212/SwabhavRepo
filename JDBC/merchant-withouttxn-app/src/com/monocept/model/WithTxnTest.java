package com.monocept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WithTxnTest {
	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/transection?useSSL=false&serverTimezone=UTC", "root", "root");
		connection.setAutoCommit(false);

		
		
		Statement stmt = connection.createStatement();
		
		PreparedStatement customerQuery = connection.prepareStatement("select * from customer where id = 2");
	//PreparedStatement merchantQuery = connection.prepareStatement("select * from merchant where id 2");
		ResultSet resultSet;
		resultSet = customerQuery.executeQuery();
		
		int id;
		String cName;
		double balance;
		while (resultSet.next()) {
			id = resultSet.getInt("id");
			cName = resultSet.getString("cName").trim();
			balance = resultSet.getDouble("balance");
			System.out.println(" ID : " + id + " Name : " + cName+" balance "+balance);
		}
		
		
		
		int customerRowCount = stmt.executeUpdate("UPDATE customer SET balance = balance-500 WHERE id=2;");
		
		int merchantRowCount = stmt.executeUpdate("UPDATE merchant SET balance = balance+500 WHERE id=9;");
		
		
		if (customerRowCount==1 && merchantRowCount==1) {
			connection.commit();
			System.out.println("changes made");
		}
		else {
			connection.rollback();
		}
	}



}
