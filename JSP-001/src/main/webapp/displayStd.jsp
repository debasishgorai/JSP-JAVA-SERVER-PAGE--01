<%@page import="pack001.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DisplayStudent</title>
</head>
<body >

<h1>  <%=  Student.getRoll() %></h1>


<h1>  <%=  Student.getName() %></h1>


<%Student s= new Student() ;%>
<h1><%=s.getAge() %></h1>
<h1><%=s.getSubject() %></h1>
</body>
</html>