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
	<h1 align="center">- WELCOME TO BOOK ADD PAGE -</h1>
	<div align="center">
		<form:form action="addBook" modelAttribute="book" method="POST" >
			<table>
				<thead>
					<tr align="center">
						<th colspan="2"><h3>Add BOOKS HERE</h3></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Name</td>
						<td><form:input path="bookName"/></td>
					</tr>
					<tr>
						<td>Author</td>
						<td><form:input path="author" /></td>
					</tr>
					<tr>
						<td>Price</td>
						<td><form:input path="price" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="ADD BOOK"></td>
						<td align="center"><input type="reset" value="RESET"></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<a href="getAll">Get All Books</a>
		<h1 align="center" style="color: green;">${msg}</h1>
	</div>

</body>

</html>