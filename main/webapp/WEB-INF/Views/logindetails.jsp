<%@page import="com.technoelevate.EMPLOYEECONTROLLER.DTO.EmployeeDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN DETAILS</title>
<% String msg=(String)request.getAttribute("msg");
session.getAttribute("empd");
EmployeeDetails empd=(EmployeeDetails)session.getAttribute("empd");
%>

</head>
<body>
<h2><%=msg %></h2><br>
<br>
<form action="./details" method="post">
<input type="Submit" value="MY DETAILS">
</form><br><br>

<form action="./showdetails" method="post">
<input type="Submit" value="All DETAILS">
</form><br><br>

<form action="./update" method="post">
<input type="Submit" value="UPDATE">
</form><br><br>

<form action="./searchdetails" method="post">
EMPLOYEE ID:<input type="text" name="empid">
<input type="Submit" value="SEARCH">
</form><br><br>

<form action="./delete" method="post">
<input value=<%=empd.getEmpid()%> name="empid">
<input type="submit" value="DELETE PROFILE">
</form><br><br>

<form action="./logout" method="post">
<input type="submit" value="LOGOUT">
</form>

</body>
</html>
