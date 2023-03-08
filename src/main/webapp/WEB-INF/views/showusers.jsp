<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Email</td>
		</tr>
		<c:forEach var="user" items="${users }">
			<tr>
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td>${user.email }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>