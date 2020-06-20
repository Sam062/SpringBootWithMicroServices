<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<body>

	<h1>WELCOME TO USER REG PAGE</h1>
	<form:form action="reg" modelAttribute="user" method="POST">
		<table>
			<tr>
				<td>USER ID</td>
				<td><form:input path="uid" /></td>
			</tr>
			<tr>
				<td>USER NAME</td>
				<td><form:input path="uname" /></td>
			</tr>
			<tr>
				<td>LOCATION</td>
				<td><form:input path="loc" /></td>
			</tr>
			<tr>
				<td>MOBILE No</td>
				<td><form:input path="mob" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="RESET"></td>
				<td><input type="submit" value="SUBMIT"></td>
			</tr>

		</table>
	</form:form>

</body>
</html>