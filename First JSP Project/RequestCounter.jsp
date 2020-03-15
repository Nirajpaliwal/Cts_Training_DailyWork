<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- declaration tag -->
<%! int requestCount = 0; %>


<!-- scriptlet tag -->
<%--This is Hidden/Invisible Comment not visible to user --%>
<%
requestCount++;
%>

<!-- Expression tag -->
<h1>No of users visited : <%=requestCount%></h1>
<h1>Todays date is :  : <%=new Date()%></h1>

<%@ include file="JspDemo.jsp" %>


</body>
</html>