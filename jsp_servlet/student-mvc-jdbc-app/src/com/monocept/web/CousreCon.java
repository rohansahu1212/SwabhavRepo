package com.monocept.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/coursecon")
public class CousreCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CousreCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
     PrintWriter out= res.getWriter();
     int id= Integer.valueOf(req.getParameter("id"));
     out.print("<h1>"+id+"</h1>");
     
     RequestDispatcher view = req.getRequestDispatcher("courselist.jsp");
     view.forward(req, res);
   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	}

}
