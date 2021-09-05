<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATED</title>
<%String msg=(String)request.getAttribute("msg"); %> 
</head>
<body>
<h2><%=msg %></h2>
<form action="./login">
<input type="submit" value="Login">
</form>
<form action="./home" >
<input type="submit" value="CREATE ACCOUNT"></form>
</body>
</html>
