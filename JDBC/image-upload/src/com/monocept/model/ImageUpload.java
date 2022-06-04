package com.monocept.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageUpload {
	public static void main(String[] args) throws SQLException, FileNotFoundException {
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/indiadb?useSSL=false&serverTimezone=UTC", "root", "root");

		System.out.println(con.getClass());
		 PreparedStatement pstmt = con.prepareStatement("INSERT INTO images VALUES(?,?)");
	      pstmt.setString(1, "image1");
	      InputStream in = new FileInputStream("images\\pic2.jpeg");
	      pstmt.setBlob(2, in); 
	      pstmt.execute();
	      System.out.println("Record inserted......");
	}
}
