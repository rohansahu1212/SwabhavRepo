package com.monocept.repo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.monocept.model.Image;


public class ImageRepository {
	List<Image> images = new ArrayList<Image>();

	public void uploadImage(InputStream in, int id) throws FileNotFoundException, SQLException, ClassNotFoundException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohandbms?useSSL=false&serverTimezone=UTC",
				"root", "root");

		System.out.println(con.getClass());
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO image VALUES(?,?)");
		pstmt.setInt(1, id);
		// InputStream in = new FileInputStream("images\\pic2.jpeg");
		pstmt.setBlob(2, in);
		pstmt.execute();
		System.out.println("Record inserted......");
	}
	public List<Image> viewImage() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohandbms?useSSL=false&serverTimezone=UTC",
				"root", "root");
		
		   Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select * from image");
           
           while (rs.next()) {
        	    System.out.println(rs.getInt("id"));
        	    byte[] imgData = rs.getBytes("Photo");//Here....... r1.getBytes() extract byte data from resultSet 
                images.add(new Image(rs.getInt("id"), imgData));
        	}
           
           return images;

	}

}
