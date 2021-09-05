<%@page import="java.util.List"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.technoelevate.springmaven.dto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALL DETAILS</title>
</head>
<body>
<h2>ALL DETAILS</h2>
<c:forEach var="empd" items="${empd}">
    ${empd}<br>
</c:forEach>

</body>
</html>
