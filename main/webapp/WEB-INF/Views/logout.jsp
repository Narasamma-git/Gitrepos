<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout</title>
<% session.invalidate(); %>
</head>
<body>
<h2>LOGOUT SUCCESSFULL</h2>
<form action="./home" >
<input type="submit" value="Home"></form>

</body>
</html>