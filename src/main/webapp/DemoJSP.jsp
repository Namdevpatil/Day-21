<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- script let tag -->
	<%
		String text = request.getParameter("text-message");
	%>
	
	Text Message: <%= text %><!-- expression tag -->
	

</body>
</html>