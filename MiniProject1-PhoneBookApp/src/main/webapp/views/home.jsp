<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container" align="center">
		<h1 class="text text-primary">Welcome To Phone Book App</h1>
		<hr>
		<form:form action="/add" method="POST" modelAttribute="Model">

			<table class="table-hover">
				<tr>
					<td colspan="2" class="success">
						<h3 class="text text-warning" align="center">CONTACT DETAILS</h3>
					</td>
				</tr>
				<tr>
					<td>CONTACT NAME</td>
					<td><form:input path="contactName" /></td>
				</tr>
				<tr>
					<td>CONTACT EMAIL</td>
					<td><form:input path="contactEmail" /></td>
				</tr>
				<tr>
					<td>CONTACT NUMBER &nbsp;</td>
					<td><form:input path="contactNumber" /></td>
				</tr>
				<tr>
					<td>CREATED DATE</td>
					<td><form:input path="createdDate" /></td>
				</tr>
				<tr>
					<td>UPDATED DATE</td>
					<td><form:input path="updatedDate" /></td>
				</tr>
				<tr>
					<td align="right"><input type="submit" class="btn btn-primary"
						value="ADD" /></td>
					<td align="center"><input type="reset" class="btn btn-primary"
						value="RESET" /></td>
				</tr>
			</table>
		</form:form>
		<h3 class="text-success">${msg}</h3>
	</div>

</body>
</html>