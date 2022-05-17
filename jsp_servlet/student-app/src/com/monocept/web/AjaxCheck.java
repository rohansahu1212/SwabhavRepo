package com.monocept.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.StyledEditorKit.BoldAction;

import com.monocept.model.Student;
import com.monocept.model.StudentService;

/**
 * Servlet implementation class AjaxCheck
 */
@WebServlet("/ajax")
public class AjaxCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjaxCheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = (String) request.getParameter("id");
		System.out.println("in do get ajax " + id);
		int rollno = Integer.valueOf(id);

		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		Student student = null;
		for (Student std : StudentService.getObject().getStudents()) {
			if (rollno == std.getRollNo()) {
				out.print("found");
				return ;
			}

		}
		out.print(" not found");
	
//		response.getWriter().write("false");
//
//		response.getWriter().write("hey bro " + id);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
