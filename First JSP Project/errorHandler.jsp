<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isErrorPage="true" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="font-size: 30px; color: red;">An Internal Error Occured</h1>
	<%
		exception.printStackTrace();
	%>
</body>
</html>