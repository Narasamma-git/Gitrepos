<%@page import="com.technoelevate.springmaven.dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<%EmployeeDTO empd=(EmployeeDTO)request.getAttribute("empd");
int id=empd.getId();
String name=empd.getName();
String password=empd.getPassword();
%>
<body>
<h2>SEARCHED DATA</h2>
EMPLOYEE ID :<%=id %><br><br>
FIRST NAME :<%=name %><br><br>
PASSWORD :<%=password %><br><br>
<form action="./logout" method="post">
<input type="submit" value="LOGOUT">
</form>

</body>
</html>