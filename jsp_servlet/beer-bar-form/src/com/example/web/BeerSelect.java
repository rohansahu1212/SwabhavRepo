package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

@WebServlet("/beer")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BeerSelect() {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice<br>");
		String c = request.getParameter("color");
		out.println("<br>Got beer color " + c);

		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);

		out.println("Beer Selection Advice<br>");

		for (Object beerName : result)
			out.println("<br> try " + beerName.toString());

	}

}
