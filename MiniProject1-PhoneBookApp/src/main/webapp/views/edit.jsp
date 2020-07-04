<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%@include file="Header.jsp"%>

	<div class="container" align="center">
		<form:form action="/update" method="POST"
			modelAttribute="contactModel">

			<table class="table-hover">
				<tr>
					<td colspan="2" class="danger">
						<h3 class="text text-warning" align="center">Update Details</h3>
					</td>
				</tr>
				<tr>
					<td>CONTACT ID</td>
					<td><form:input path="contactID" readonly="true" /></td>
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
					<td align="center" colspan="3"><input type="submit" class="btn btn-danger"
						value="UPDATE" /></td>
				</tr>
			</table>
		</form:form>
		<h3 class="text-success">${msg}</h3>
	</div>

</body>