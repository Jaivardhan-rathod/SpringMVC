<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
<h1>Employee Details</h1>
${Emp1 } <!-- we are able to see output beacause of to string method.  -->

<%-- <c:forEach var="emp" items="${Emp1 }">
<b>emp</b>
</c:forEach> --%>

</body>
</html>