<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	errorPage="errorHandler.jsp" 
	isErrorPage="false"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello from jsp demo file</h1>

	<%-- <%
		String company = request.getParameter("company");
		out.write("<h1>" + company + "</h1>");
	
	%> --%>


	<%! int a = 20, b = 0, result; %>

	<%
		b = Integer.parseInt(request.getParameter("t1"));
		result = a + b;
		out.write("<h1> Result = " + result + "</h1>");
	%>
</body>
</html>