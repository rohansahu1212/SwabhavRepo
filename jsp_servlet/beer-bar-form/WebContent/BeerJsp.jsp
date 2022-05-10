<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List styles = (List) request.getAttribute("styles");
	Iterator it = styles.iterator();
	while (it.hasNext()) {
		out.print("<br>----try: " + it.next());
	}
	%>
</body>
</html>