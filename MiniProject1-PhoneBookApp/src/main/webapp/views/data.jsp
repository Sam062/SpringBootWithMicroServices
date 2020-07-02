<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@taglib uri="" prefix="c"%> --%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%@include file="Header.jsp"%>
	<div class="card" align="center">
		<table class="table-hover">
			<thead>
				<tr class="success">
					<th colspan="5" class="info"><h2 class="text text-primary">Phone Book Data</h2></th>
				</tr>
				<tr>
					<th>S.No</th>
					<th>Name</th>
					<th>Email</th>
					<th>Phone</th>
					<th colspan="2">Action</th>
				</tr>
			</thead>
<!-- 			<tbody> -->
<!-- 				<tr> -->
<%-- 					<c:forEach items="${list}" var="list"> --%>
<%-- 						<td>${list.contactID}</td> --%>
<%-- 						<td>${list.contactName}</td> --%>
<%-- 						<td>${list.contactEmail}</td> --%>
<%-- 						<td>${list.contactNumber}</td> --%>
<!-- 						<td><a href="#" class="btn btn-success">EDIT</a></td> -->
<!-- 						<td><a href="#" class="btn btn-danger">DELETE</a></td> -->
<%-- 					</c:forEach> --%>
<!-- 				</tr> -->
<!-- 			</tbody> -->

		</table>
		<h3 class="text-success">${msg}</h3>
	</div>

</body>
</html>