package com.monocept.web;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertdata")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/monocept?useSSL=false&serverTimezone=UTC", "root", "root");
	System.out.println(con.getClass());
		} catch (ClassNotFoundException e) {
			System.out.println(e+"   from class not found");
			e.printStackTrace();
		}
		catch (SQLException e1) {
			System.out.println(e1+"   sql exception");
			e1.printStackTrace();
		} 

		try {
			PreparedStatement ps = con.prepareStatement("select * from students");
			ResultSet resultSet;
			resultSet = ps.executeQuery();
			int code;
			String title;
			PrintWriter out = response.getWriter();
			
			while (resultSet.next()) {
				code = resultSet.getInt("studentId");
				title = resultSet.getString("Name").trim();
				out.println("Student ID : " + code + " Student : " + title);
			}

			resultSet.close();
			ps.close();
			con.close();
			out.println("<html><body><b>Successfully Inserted" + "</b></body></html>");

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());


		} catch (Exception e) {
			e.printStackTrace();
			PrintWriter out = response.getWriter();
			out.print(e);

		}

	}
}
