<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>

	<h2>--- WELCOME TO USER HOME PAGE ---</h2>
	<form action="register" method="post">
		<table>
			<tr>
				<td>USER NAME</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="REGISTER"></td>
			</tr>
		</table>
	</form>

</body>
</html>