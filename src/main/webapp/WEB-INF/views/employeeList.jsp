<%@page import="com.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Employee> empList = (List<Employee>) request.getAttribute("EmployeeList");
	for (Employee e : empList) {
	%>
	<%
	out.print(e.getId());
	out.print(e.getName());
	out.print(e.getSalary());
	%>
	<br>
	<%
	}
	%>
	<hr>

</body>
</html>