package com.monocept.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		List<String> studentsName = new StudentList().getStudents();

		
		pw.println("<table border = \"1\">\r\n" + 
				"  <tr>");
		for (String name : studentsName) {
			pw.println("<tr><td>"+name+"</td></tr>");
		}
		pw.println("</table>\r\n" + 
				"  </tr>");
		pw.print("</body>"
				+ "</html>");
	}

}
