package com.monocept.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;
import com.monocept.service.StudentService;


@WebServlet("/deletecon")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public DeleteController() {
	
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("in delete controller");
		int id = Integer.valueOf(req.getParameter("id"));
		PrintWriter out = res.getWriter();
		List<Student> studentslist = StudentService.getObject().getStudents();

		Student std = studentslist.get(id);

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
			ps = con.prepareStatement("DELETE FROM student WHERE rollNo= " + std.getRollNo() + ";");

			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("--------- " + e);
		}

		res.sendRedirect("homecon");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}

}
