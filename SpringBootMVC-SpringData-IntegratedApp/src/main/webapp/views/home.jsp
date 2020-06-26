<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center">- WELCOME TO BOOK MANAGEMENT -</h1>
	<hr>
	<div class="container" align="center">
		<form:form action="addBook" modelAttribute="book" method="POST" >
			<table class="table table-hover">
				<thead>
					<tr align="center">
						<td colspan="2" align="center" class="info"><h2>ADD BOOKS HERE</h2></td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td align="right">Book Name</td>
						<td><form:input path="bookName"/></td>
					</tr>
					<tr>
						<td align="right">Author</td>
						<td><form:input path="author" /></td>
					</tr>
					<tr>
						<td align="right">Price</td>
						<td><form:input path="price" /></td>
					</tr>
					<tr>
						<td align="right"><input type="submit" class="btn btn-primary" value="ADD BOOK"></td>
						<td align="left"><input type="reset" class="btn btn-primary" value="RESET"></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<a href="getAll" class="btn btn-info btn-lg">Get All Books</a>
		<h1 align="center" style="color: green;">${msg}</h1>
	</div>

</body>

</html>