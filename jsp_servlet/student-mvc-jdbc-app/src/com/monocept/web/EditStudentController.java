package com.monocept.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.Student;
import com.monocept.service.StudentService;



@WebServlet("/edit")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int id;
    public EditStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		id=Integer.valueOf(req.getParameter("id"));
	
		RequestDispatcher view = req.getRequestDispatcher("editstudent.jsp");
		view.forward(req, res);
		
}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("hey from edit student");
		System.out.println("Student do pos method");
		String roll=req.getParameter("rollno");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String cgpa=req.getParameter("cgpa");
		System.out.println(roll+" "+cgpa+" "+fname+" "+lname);
		if(roll!=null && fname!=null && lname!=null && cgpa!=null) {
			Student student= new Student(fname, lname,Integer.valueOf(roll), Double.valueOf(cgpa));
			List<Student> list=StudentService.getObject().getStudents();
			list.set(id, student);
			res.sendRedirect("http://localhost:8090/student-app/homecon");  
		}
	}

}
