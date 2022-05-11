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
			<script src="https://code.jquery.com/jquery-3.6.0.js"
		integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
		crossorigin="anonymous"></script>

	<script type="text/javascript">
		function validate() {
			alert("hey validation in edit")
			var fname = $('#fname').val();
			var lname = $('#lname').val();
			var rollno = $('#rollno').val();
			var cgpa = $('#cgpa').val();
		    var regex = /^[1-9]\d*(\.\d+)?$/;
			if(rollno.trim()==""){
				alert("roll can't be bank");
				return false;
			}
			if(fname.trim()==""){
				alert("first name can't be bank");
				return false;
			}
			if(lname.trim()==""){
				alert("last name can't be bank");
				return false;
			}
			if(cgpa.trim()==""){
				alert("cgpa can't be bank");
				return false;
			}
     
            if(regex.test(cgpa)){
             
                
            }
            else {
				alert("it's not valid cgpa" + cgpa);
				return false;
			}
            
            if(regex.test(rollno)){
             
                
                
            }
            else {
				alert("it's not valid roll  " + rollno);
				return false;
			}
		
		}
	</script>
		
		
	<form  onsubmit="return validate();"  action="http://localhost:8090/student-app/edit" method="post">
		<div class="form-floating mb-3">
			<input type="text" class="form-control" 
				placeholder="<%out.print(student.get(id).getRollNo()); %> " id ="rollno" name="rollno" value="<%out.print(student.get(id).getRollNo()); %>"> 
		</div>
		<div class="form-floating">
			<input type="text" class="form-control"
				placeholder="<%out.print(student.get(id).getFirstName()); %> " id="fname" name="fname" value="<%out.print(student.get(id).getFirstName()); %>">
				<br> 
		</div>
		<div class="form-floating">
			<input type="text" class="form-control" 
				placeholder="no " id="lname" name="lname" value="<%out.print(student.get(id).getLastName()); %>">
				<br> 
		</div>
		<div class="form-floating">
			<input type="text" class="form-control"
				placeholder="<%out.print(student.get(id).getCgpa()); %> " id="cgpa" name="cgpa" value="<%out.print(student.get(id).getCgpa()); %>">
				<br> 
		</div>
		<input type="submit" value="Edit">
	</form>
</body>
</html>