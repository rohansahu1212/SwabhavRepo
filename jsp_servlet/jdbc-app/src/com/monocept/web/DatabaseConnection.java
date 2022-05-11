package com.monocept.web;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// This class can be used to initialize the database connection
public class DatabaseConnection {
	static Connection conn = null;

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/monocept?useSSL=false&serverTimezone=UTC", "root", "root");
	System.out.println(con.getClass());
		} catch (SQLException e1) {
		
			e1.printStackTrace();
		} 
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from students");
			ResultSet resultSet;
			resultSet = ps.executeQuery();
			int code;
			String title;
		
			
			while (resultSet.next()) {
				code = resultSet.getInt("studentId");
				title = resultSet.getString("Name").trim();
				System.out.println("Student ID : " + code + " Student : " + title);
			}

			resultSet.close();
			ps.close();
			con.close();}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}