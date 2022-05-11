package com.monocept.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.Student;
import com.monocept.model.StudentService;
import com.monocept.model.UserDTO;

@WebServlet("/addstudent")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudentController() {
		System.out.println("add student  called");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();

		System.out.println("in login area --------------------");

		UserDTO dto = (UserDTO) session.getAttribute("login");
		if (dto == null) {
			res.sendRedirect("http://localhost:8090/student-app/logincon");
			return;
		}

		RequestDispatcher view = req.getRequestDispatcher("addStudent.jsp");
		view.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		System.out.println("Student do pos method");
		String roll = req.getParameter("rollno");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String cgpa = req.getParameter("cgpa");
		System.out.println(roll + " " + cgpa + " " + fname + " " + lname);
		if (roll != null && fname != null && lname != null && cgpa != null) {
			Student student = new Student(fname, lname, Integer.valueOf(roll), Double.valueOf(cgpa));
			StudentService.getObject().addStudent(student);
			res.sendRedirect("http://localhost:8090/student-app/homecon");
		}
	}

}
