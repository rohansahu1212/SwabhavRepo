package com.monocept.web;

import java.io.IOException;
import java.rmi.dgc.DGC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.Student;

@WebServlet("/addstudent")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudentController() {
		System.out.println("add student  called");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();

		RequestDispatcher view = req.getRequestDispatcher("addStudent.jsp");
		view.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("Student do pos method");
		String roll = req.getParameter("rollno");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String cgpa = req.getParameter("cgpa");
		
		double dcgpa=Double.valueOf(cgpa);
		
		int id= Integer.valueOf(roll);
		 
		System.out.println("in add page post----------------------");
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohandbms?useSSL=false&serverTimezone=UTC",
					"root", "root");
			System.out.println(con.getClass());
		} catch (ClassNotFoundException e) {
			System.out.println(e + "   from class not found");
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println(e1 + "   sql exception");
			e1.printStackTrace();
		}
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("INSERT INTO student VALUES("+id+",?,?,"+dcgpa+")");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.execute();
		} catch (SQLException e) {	
			e.printStackTrace();
			System.out.println("--------- "+e);
		}
		
		RequestDispatcher view = req.getRequestDispatcher("home.jsp");
		view.forward(req, res);
		
	
	}

}
