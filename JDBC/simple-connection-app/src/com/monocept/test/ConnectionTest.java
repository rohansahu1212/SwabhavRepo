package com.monocept.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class ConnectionTest {
	Connection connection = null;

	public ConnectionTest() throws SQLException {
		this.connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/monocept?useSSL=false&serverTimezone=UTC", "root", "root");
	}

	public static void main(String[] args) throws SQLException {

		ConnectionTest ct = new ConnectionTest();
		// ct.dataEnter(71, "vijay");
		ct.dataAlter(2, "shikhar");
		ct.Display();
	}

	void dataEnter(int num, String name) throws SQLException {
		System.out.println();
		String sql = "INSERT INTO students VALUES (" + num + ", '" + name + "')";
		PreparedStatement stmt = connection.prepareStatement(sql);

		stmt.executeUpdate(sql);
		System.out.println("Data entered");
	}

	private void dataAlter(int roll, String name) throws SQLException {

		System.out.println();
		String sql = "UPDATE students SET studentName = '" + name + "' WHERE studentId =" + roll + ""; //
		//
		PreparedStatement stmt = connection.prepareStatement(sql);

		stmt.executeUpdate(sql);
		System.out.println("Data update");
	}

	void Display() {
		try {
			PreparedStatement ps = connection.prepareStatement("select * from students");
			ResultSet resultSet;
			resultSet = ps.executeQuery();
			int code;
			String title;
			while (resultSet.next()) {
				code = resultSet.getInt("studentId");
				title = resultSet.getString("studentName").trim();
				System.out.println("Student ID : " + code + " Student : " + title);
			}

			resultSet.close();
			ps.close();
			connection.close();

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		} finally {

		}
	}
}
