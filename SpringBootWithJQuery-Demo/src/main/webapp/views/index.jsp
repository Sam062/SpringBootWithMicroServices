<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
<script>
	$(function() {
		// Initialize form validation on the registration form.
		// It has the name attribute "registration"
		$("form[name='registration']").validate({
			// Specify validation rules
			rules : {
				// The key name on the left side is the name attribute
				// of an input field. Validation rules are defined
				// on the right side
				fname : "required",
				lname : "required",

				email : {
					required : true,
					// Specify that email should be validated
					// by the built-in "email" rule
					email : true
				},
				pwd : {
					required : true,
					minlength : 5
				}
			},
			// Specify validation error messages
			messages : {
				fname : "Please enter your First name",
				lname : "Please enter your Last name",

				pwd : {
					required : "Please provide password",
					minlength : "Your pwd must be at least 5 characters long"
				},
				email : "Please enter a valid email address"
			},
			// Make sure the form is submitted to the destination defined
			// in the "action" attribute of the form when valid
			submitHandler : function(form) {
				form.submit();
			}
		});
	});
</script>
<title>PhoneBook App</title>
</head>
<body>
	<h1>WELCOME HOME</h1>

	<form:form action="reg" method="POST" modelAttribute="model"
		name="registration">
		FNAME : <form:input path="fname" />
		<br>
		LNAME : <form:input path="lname" />
		<br>
		EMAIL : <form:input path="email" />
		<br>
		PASSWORD : <form:input path="pwd" />
		<br>
		<input type="submit" value="REGISTER">
	</form:form>

</body>
</html>