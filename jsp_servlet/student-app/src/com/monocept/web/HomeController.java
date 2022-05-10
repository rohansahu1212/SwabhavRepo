package com.monocept.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;
import com.monocept.model.StudentService;

@WebServlet("/homecon")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HomeController() {
		System.out.println("hey");
	}
	

	@Override

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		
		List<Student> studentsName =  StudentService.getObject().getStudents();

		req.setAttribute("studentList", studentsName);
		
		RequestDispatcher view = req.getRequestDispatcher("Home.jsp");
		view.forward(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
