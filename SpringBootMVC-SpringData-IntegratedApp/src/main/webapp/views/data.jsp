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
	<div align="center">
		<h1 align="center">- ALL BOOKS HERE -</h1>
		<table class="table">
		<thead>
			<tr>
				<th><h2>Book Details</h2></th>
			</tr>
		</thead>
			<thead>
				<tr>
					<th>BOOK NAME</th>
					<th>AUTHOR</th>
					<th>PRICE</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="l">
					<tr>
						<td>${l.bookName }</td>
						<td>${l.author }</td>
						<td>${l.price }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="home">Add New Book</a>
	</div>

</body>
</html>