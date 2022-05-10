<%@page import="com.monocept.model.StudentService"%>
<%@page import="com.monocept.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<h1>Hello, world!</h1>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
		<% 
		int id= Integer.valueOf(request.getParameter("id"));
		List<Student> student= StudentService.getObject().getStudents();
		System.out.print(id+"from student");
		%>>
	<form action="http://localhost:8090/student-app/edit" method="post">
		<div class="form-floating mb-3">
			<input type="text" class="form-control" id="floatingInput"
				placeholder="<%out.print(student.get(id).getRollNo()); %> " name="rollno" value="<%out.print(student.get(id).getRollNo()); %>"> 
		</div>
		<div class="form-floating">
			<input type="text" class="form-control" id="floatingPassword"
				placeholder="<%out.print(student.get(id).getFirstName()); %> " name="fname" value="<%out.print(student.get(id).getFirstName()); %>">
				<br> 
		</div>
		<div class="form-floating">
			<input type="text" class="form-control" id="floatingPassword"
				placeholder="no " name="lname" value="<%out.print(student.get(id).getLastName()); %>">
				<br> 
		</div>
		<div class="form-floating">
			<input type="text" class="form-control" id="floatingPassword"
				placeholder="<%out.print(student.get(id).getCgpa()); %> " name="cgpa" value="<%out.print(student.get(id).getCgpa()); %>">
				<br> 
		</div>
		<input type="submit" value="Edit">
	</form>
</body>
</html>