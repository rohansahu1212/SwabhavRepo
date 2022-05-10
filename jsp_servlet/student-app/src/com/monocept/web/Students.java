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
import com.monocept.model.StudentList;

@WebServlet("/students")
public class Students extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Students() {
		System.out.println("hey");
	}

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.print("<html>"
				+ ""
				+ "<head><title>student records</title></head>"
				+ "<body>"
				+ "<h1>Student records</h1>"
				+ "<br>");
		List<Student> studentsName = new StudentList().getStudents();

		
		pw.println("<table border = \"1\">\r\n" + 
				"  <tr>");
		
		pw.print("<tr><td>Fisrt name</td>"
				+ "<td>Last name</td>"
				+ "<td>roll no </td>"
				+ "<td>CGPA</td></tr>");
		for (Student student : studentsName) {
			pw.println("<tr><td>"+student.getFirstName()+"</td>"
					+ "<td>"+student.getLastName()+"</td>"
					+ "<td>"+student.getRollNo()+"</td>"
					+ "<td>"+student.getCgpa()+"</td>"
					+ "</tr>");
		}
		pw.println("</table>\r\n" + 
				"  </tr>");
		pw.print("</body>"
				+ "</html>");
	}

}
