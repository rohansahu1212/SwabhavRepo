<%@page import="com.monocept.model.StudentService"%>
<%@page import="com.monocept.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!doctype
html>
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

<title>Student record</title>
</head>
<body>
	<h1>
		Number of Student
		<%
		List<Student> students = (List) request.getAttribute("studentList");
	out.print(students.size());
	%>
	</h1>

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


	<table class="table">
		<thead>
			<tr>
				<th scope="col">Roll no</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Last</th>
				<th scope="col">CGPA</th>
			</tr>
			<%
				//	List<Student> students = (List) request.getAttribute("studentList");
			int count=0;
			for (Student std : students) {
				out.println("<tr><td>" + std.getRollNo() + "</td><td>" + std.getFirstName() + "</td><td>" + std.getLastName()
				+ "</td><td>" + std.getCgpa() + "<td><a href=\"edit?id="+count+"\" class=\"btn btn-primary\" role=\"button\" name = " + count
				+ "<td>edit</a></td></tr>");
				count++;

			}
			%>
		
	</table>

	<br>
	<a href="addstudent" class="btn btn-primary" role="button">Add
		Student</a>
</body>
</html>