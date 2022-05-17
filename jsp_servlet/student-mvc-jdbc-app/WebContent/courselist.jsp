<!doctype html>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.monocept.service.StudentService"%>
<%@page import="com.monocept.model.Student"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<title>Courses</title>
</head>
<body>


<table class="table table-dark table-striped">


	<%
  int id= Integer.valueOf(request.getParameter("id"));
  Student student=StudentService.getObject().getStudents().get(id);
  %>
	<h1>
		course taken by
		<%out.print(" "+student.getFirstName()); %>
	</h1>

	<%
    
    Connection con = null;
    try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohandbms?useSSL=false&serverTimezone=UTC",
				"root", "root");
		System.out.println(con.getClass());
	} catch (ClassNotFoundException e) {
		System.out.println(e + "   from class not found");
		e.printStackTrace();
	} catch (SQLException e1) {
		System.out.println(e1 + "   sql exception");
		e1.printStackTrace();
	}

	try {
		String quryString="SELECT cName, duration FROM ( student_course INNER JOIN student ON student.rollNo= student_course.sId) "+
	"INNER JOIN course ON course.courseId = student_course.cId WHERE student.rollNo="+student.getRollNo()+";";
		PreparedStatement ps = con.prepareStatement(quryString);
		ResultSet resultSet;
		resultSet = ps.executeQuery();
		int code;

		while (resultSet.next()) {
			
			String cName = resultSet.getString("cName").trim();
			String duration = resultSet.getString("duration").trim();
			out.print("<tr class=\"table-primary\"><td>"+cName+"</td><td>"+duration+"</td></tr>");
	

		}

		resultSet.close();
		ps.close();
		con.close();

	} catch (Exception e) {

	}
    %>
    </table>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
</body>
</html>