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
	<script src="https://code.jquery.com/jquery-3.6.0.js"
		integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
		crossorigin="anonymous"></script>

	<script>
		// my code
		

		$(document).ready(function() {
			$('#rollno').keyup(function(e) {
				
                
                var id=$('#rollno').val()
                
                
                $.ajax({
                    url:"ajax",
                    data:{id:id},
                    type:"get",
                    success: function(result){
                    	console.log(result+" by getting response")
                        if(result==true)
                        	$("#idlebel").html(" roll no taken");
                        else
                        	$("#idlebel").html(" it exits ");
                    }
                })
			});

		});
	</script>

	<script type="text/javascript">
		function validate() {
			var fname = $('#fname').val();
			var lname = $('#lname').val();
			var rollno = $('#rollno').val();
			var cgpa = $('#cgpa').val();
			var regex = /^\d+$/;
			if (rollno.trim() == "") {
				alert("roll can't be bank");
				return false;
			}
			if (fname.trim() == "") {
				alert("first name can't be bank");
				return false;
			}
			if (lname.trim() == "") {
				alert("last name can't be bank");
				return false;
			}
			if (cgpa.trim() == "") {
				alert("cgpa can't be bank");
				return false;
			}

			if (regex.test(cgpa)) {

			} else {
				alert("it's not valid cgpa" + cgpa);
				return false;
			}

			if (regex.test(rollno)) {

				return true;

			} else {
				alert("it's not valid roll  " + rollno);
				return false;
			}

		}
	</script>
	<form onsubmit="return validate();"
		action="addstudent" method="post">
		<div class="form-floating mb-3">
			<input type="text" class="form-control" id="rollno"
				placeholder="Enter roll " name="rollno">
				<label for="html" id="idlebel">HTML</label><br>
		</div>
		<div class="form-floating">
			<input type="text" class="form-control" id="fname"
				placeholder="Enter First Name" name="fname"> <br>
		</div>
		<div class="form-floating">
			<input type="text" class="form-control" id="lname"
				placeholder="Enter Last" name="lname"> <br>
		</div>
		<div class="form-floating">
			<input type="text" class="form-control" id="cgpa"
				placeholder="Enter CGPA" name="cgpa"> <br>
		</div>
		<input type="submit" value="Submit">
	</form>
</body>
</html>