<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="org.springframework.http.HttpRequest"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("name");
		List<String> emp = (List<String>) request.getAttribute("emp");
	%>
	<h1>
		name is<%= name%>
	</h1>
	
	
	<% for(String s:emp) { %>
	<h1><%= s %></h1>
	<%} %>
	
</body>
</html>