<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container" align="center">
		<h1 align="center">- WELCOME TO BOOK MANAGEMENT -</h1><hr>
		<table class="table table-bordered">
			<tr>
				<td align="center" colspan="3" class="info"><h2>Book Details</h2></td>
			</tr>
			<tr class="danger">
				<th>BOOK NAME</th>
				<th>AUTHOR</th>
				<th>PRICE</th>
			</tr>
			<c:forEach items="${list}" var="l">
				<tr>
					<td>${l.bookName }</td>
					<td>${l.author }</td>
					<td>${l.price }</td>
				</tr>
			</c:forEach>
		</table>
		<a href="home" class="btn btn-info btn-lg">Add New Book</a>
	</div>

</body>
</html>