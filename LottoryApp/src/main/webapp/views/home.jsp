<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<h1 class="text-primary" align="center">WELCOME TO LOTTERY PAGE</h1>
	<hr>
	<hr>
	<div class="container" align="center">
		<h1 class="text text-danger">${msg}</h1>
		<form class="form form-inline" action="check" method="POST">
			<div align="center">
				Enter NUMBER(1-9) : <input type="text" name="value"
					placeholder="Number" required="required"> <br> <br>
				<input type="submit" value="CHECK" class="btn btn-primary btn-lg">
			</div>
		</form>
		<hr>


	</div>

</body>
</html>