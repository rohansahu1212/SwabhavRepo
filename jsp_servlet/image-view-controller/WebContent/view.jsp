<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<%@ page import="java.io.*"%>
	<%@ page import="java.sql.*"%>
	<%@ page import="com.mysql.*"%>
	<%@ page import="java.util.*"%>
	<%@ page import="java.text.*"%>
	<%@ page import="javax.servlet.*"%>
	<%@ page import="javax.servlet.http.*"%>
	<%@ page import="javax.servlet.http.HttpSession"%>
	<%@ page language="java"%>
	<%@ page session="true"%>
	<%@ page import="java.sql.*"%>
	<%
		Blob image = null;
	Connection con = null;
	PreparedStatement psmnt = null;
	ResultSet rs = null;
	OutputStream oImage;

	try {
		InputStream sImage;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohandbms?useSSL=false&serverTimezone=UTC", "root",
		"root");

		psmnt = con.prepareStatement("SELECT * FROM image where id= ? ");
		psmnt.setInt(1, 5);
		rs = psmnt.executeQuery();
		   if(rs.next()) {
		        byte barray[] = rs.getBytes(2);
		        response.setContentType("image/gif");
		        oImage=response.getOutputStream();
		        oImage.write(barray);
		        oImage.flush();
		        oImage.close();
		    }
	} catch (Exception ex) {
		out.println("error-------- :" + ex);
	}

	finally {
		// close all the connections.
		rs.close();
		psmnt.close();
		con.close();
	}
	%>


</body>
</html>