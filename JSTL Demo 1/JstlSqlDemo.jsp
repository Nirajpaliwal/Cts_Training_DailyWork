<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL SQL Demo</title>
</head>
<body>

	<sql:setDataSource user="root" password="ROOT"
		url="jdbc:mysql://localhost:3306/testdb"
		driver="com.mysql.jdbc.Driver" />


	<%-- <sql:update>
		insert into test_table values(11, "Ayush")
	</sql:update>


	<sql:update>
		update test_table set id = 12 where mame="Ayush"
	</sql:update> --%>


	<sql:query var="rs" sql="select * from test_table">

	</sql:query>

	<table border= "1px solid black" style = "border-collapse:collapse">
		<tr>
			<th>Id</th>
			<th>Name</th>
		</tr>
		<c:forEach var="data" items="${rs.rows}">
			<tr>
				<td><c:out value="${data.id}"></c:out></td>
				<td><c:out value="${data.name}"></c:out></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>