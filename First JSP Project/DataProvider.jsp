<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>From DataProvider.jsp page</h1>
	<%-- <jsp:forward page="JspDemo.jsp" /> --%>

	<jsp:forward page="JspDemo.jsp" >
		<jsp:param value="CTS" name="company"/>
	</jsp:forward>

	<%-- <jsp:include page="JspDemo.jsp"></jsp:include> --%>





</body>
</html>