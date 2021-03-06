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
	<%@include file="Header.jsp"%>
	<div class="container" align="center">
		<form:form action="/add" method="POST" modelAttribute="Model">

			<table class="table-hover">
				<tr>
					<td colspan="2" class="success">
						<h3 class="text text-warning" align="center">CONTACT DETAILS</h3>
					</td>
				</tr>
				<tr>
					<td><form:hidden path="contactID" /></td>
				</tr>
				<tr>
					<td>CONTACT NAME</td>
					<td><form:input path="contactName" required="required"/></td>
				</tr>
				<tr>
					<td>CONTACT EMAIL</td>
					<td><form:input path="contactEmail" required="required"/></td>
				</tr>
				<tr>
					<td>CONTACT NUMBER &nbsp;</td>
					<td><form:input path="contactNumber" required="required"/></td>
				</tr>

				<tr>
					<td align="right"><input type="submit" class="btn btn-primary"
						value="SAVE" /></td>
					<td align="center"><input type="reset" class="btn btn-danger"
						value="RESET" /></td>
				</tr>
			</table>
		</form:form>
		<h3 class="text-success">${msg}</h3>
	</div>

</body>
</html>