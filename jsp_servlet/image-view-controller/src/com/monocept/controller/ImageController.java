package com.monocept.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.monocept.repo.ImageRepository;
import com.monocept.service.ImageService;

@WebServlet("/image")
@MultipartConfig
public class ImageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ImageController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("wokring");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Part filePart = request.getPart("img");
		int id= Integer.valueOf(request.getParameter("photocount"));
		System.out.println(filePart);
		String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
		InputStream fileContent = (InputStream) filePart.getInputStream();
		try {
			new ImageService().uploadImage(id, fileContent);
		} catch (SQLException e) {
			System.out.println("some erorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("clas not founddddddddddddddddddd");
		}
		response.sendRedirect("view");
	}

}
