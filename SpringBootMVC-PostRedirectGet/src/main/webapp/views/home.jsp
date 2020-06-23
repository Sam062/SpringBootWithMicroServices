<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${msg }
	<h2>WELCOME TO HOME PAGE</h2>

	<form:form action="/reg" method="POST" modelAttribute="user">
			ID :
		<form:input path="uid" />
		NAME :
		<form:input path="uname" />
		LOCATION:
		<form:input path="loc" />
		<input type="submit" value="submit">
	</form:form>

</body>
</html>