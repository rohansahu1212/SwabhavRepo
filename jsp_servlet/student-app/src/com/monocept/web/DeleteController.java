package com.monocept.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monocept.model.Student;
import com.monocept.model.StudentService;

@WebServlet("/deletecon")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DeleteController() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int id=Integer.valueOf(req.getParameter("id"));
	PrintWriter out= res.getWriter();
	List<Student> studentslist=StudentService.getObject().getStudents();
	
	studentslist.remove(id);
	
	res.sendRedirect("homecon");
	
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

}
