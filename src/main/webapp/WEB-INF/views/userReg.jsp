<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegesterUser1" method="post">
		<pre>
ID: <input type="text" name="id">
Name: <input type="text" name="name">
Email: <input type="text" name="email">
 <input type="submit" name="register">
 </pre>
	</form>
	<hr>
	${result }
</body>
</html>