<%@page import="java.sql.Time"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<!-- 	Ex1_Q1 -->
	<h1> Hello World</h1>
	<%= "Hello World" %>
	
<!-- 	Ex1_Q2 -->
	<p>Currrent Time: <%= java.util.Calendar.getInstance().getTime() %> </p>

<!-- 	Ex1_Q3 -->
<p>	<%! String name = "VTI Academy";%>
	<%= "Hello " + name %> </p>
<!-- Ex1_Q4 -->
	<%@ page import="java.util.Date" %>
	ToDay Is: <%=new Date()%>

</body>
</html>