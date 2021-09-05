<%@page import="com.technoelevate.springmaven.dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> EMPLOYEE DETAILS</title>
<%EmployeeDTO empd=(EmployeeDTO)session.getAttribute("empd"); %>
</head>
<body>
<h2>DETAILS</h2>
EMPLOYEE ID :<%=empd.getId() %><br><br>
 NAME :<%=empd.getName()%><br><br>
PASSWORD :<%=empd.getPassword() %><br><br>

<form action="./logout" method="post">
<input type="submit" value="LOGOUT">
</form>
</body>
</html>
