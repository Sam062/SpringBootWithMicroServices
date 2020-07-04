<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%@include file="Header.jsp"%>
	<div class="card" align="center">
		<table class="table-bordered">
			<thead>
				<tr class="success">
					<th colspan="7" class="info"><h2 align="center" class="text text-primary">Phone
							Book Data</h2></th>
				</tr>
				<tr>
					<th>S.No</th>
					<th>Name</th>
					<th>Email</th>
					<th>Phone</th>
					<th colspan="3">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="list" varStatus="index">
					<tr>
						<td>${index.count }</td>
						<td>${list.contactName}</td>
						<td>${list.contactEmail}</td>
						<td>${list.contactNumber}</td>
						<td><a href="edit?id=${list.contactID}" class="btn btn-success btn-sm">EDIT</a></td>
						<td></td>
						<td><a href="delete?id=${list.contactID}" class="btn btn-danger btn-sm">DELETE</a></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
		<h3 class="text-success">${msg}</h3>
	</div>

</body>
</html>