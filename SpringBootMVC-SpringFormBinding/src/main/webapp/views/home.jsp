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
				<td>USER NAME</td>
				<td><form:input path="uname" /></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><form:password path="pwd" /></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><form:input path="phno" /></td>
			</tr>
			<tr>
				<td>GENDER</td>
				<td><form:radiobutton path="gender" value="M" /> Male <form:radiobutton
						path="gender" value="F" /> Fe-Male</td>
			</tr>
			<tr>
				<td>COURSE</td>
				<td><form:select path="course">
						<form:option value="">-SELECT-</form:option>
						<form:option value="java">JAVA</form:option>
						<form:option value="spring">SPRING</form:option>
						<form:option value="boot">SPRING BOOT</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td>TIMING</td>
				<td><form:checkbox path="timing" value="morning" />MORNING <form:checkbox
						path="timing" value="evening" />EVENING</td>
			</tr>
			<tr>
				<td><input type="reset" value="RESET"></td>
				<td><input type="submit" value="SUBMIT"></td>
			</tr>

		</table>
	</form:form>

</body>
</html>