<%@page import="java.time.LocalDateTime"%>
<%@page isELIgnored="false"%>
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
	String phoneNo = (String) request.getAttribute("HelpNo");
	LocalDateTime Time = (LocalDateTime) request.getAttribute("Time");
	%>

	<hr>
	
	<b>Getting data from scriptlet tags</b>
	
	<h1>Help line number is: <%=phoneNo%></h1>
	<h1>Time: <%=Time%></h1>
	
	<hr>
	
	<b>Getting data from JSP Expression Language [EL]</b>
	<br><br>
	
	<b>Help line number is: ${HelpNo}</b>
	<br><br>
	
	<b>Time: ${Time }</b> 
	<br><br>
	
	<hr>
	if we don't iterate it will be shown as and object: ${days }
	<br><br>
	
	<hr>
	<b>using c tag for jstlcore features. iterate using forEach in HTML.</b>
	<h1>
		<c:forEach var="day" items="${days }">
			${day }<br>
		</c:forEach>
	</h1>
</body>
</html>