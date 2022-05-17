package com.monocept.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.monocept.model.AuthService;
import com.monocept.model.UserDTO;

@WebServlet("/logincon")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher view = req.getRequestDispatcher("login.jsp");
		view.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	//	System.out.println("in login conn postt");

		int id = Integer.valueOf(req.getParameter("id"));
		String pass = req.getParameter("pass");
		
		AuthService auth=AuthService.getInstance();
		UserDTO dto= auth.getUser(id, pass);
		
		HttpSession session=req.getSession();  
    
		session.setAttribute("login",dto);

		
		res.sendRedirect("homecon");  
		
		

	}

}
