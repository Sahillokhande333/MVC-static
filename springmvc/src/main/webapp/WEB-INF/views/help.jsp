<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>

<%
	String name=(String)request.getAttribute("name");
    Integer num=(Integer)request.getAttribute("num");
    LocalDateTime time=(LocalDateTime)request.getAttribute("time");

%>
	<h1>This is help page</h1>
	<h1>My name is: <%=name %></h1>
	<h1>for contact please call us on:<%=num %></h1>
	<h1>Fate and Time is:<%=time %></h1>
</body>
</html>