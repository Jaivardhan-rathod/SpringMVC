<%@page import="java.time.LocalDateTime"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
	/* String phoneNo = (String) request.getAttribute("Help-No"); */
	/* LocalDateTime Time = (LocalDateTime) request.getAttribute("Time"); */
	%>


	<h1>
		Help line number is	${HelpNo}
		<%-- <%=phoneNo%> --%>	
	</h1>

	<h1><%--<%=Time%>--%>${Time }</h1>
	<hr>
	${days }
	<h1>
	<c:forEach var="day" items="${days }">
	${day }
	</c:forEach>
	</h1>
</body>
</html>