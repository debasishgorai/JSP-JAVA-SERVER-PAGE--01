<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">


ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 200px;
    background-color: #f1f1f1;
}

li a {
    display: block;
    color: #000;
    padding: 8px 0 8px 16px;
    text-decoration: none;
}

/* Change the link color on hover */
li a:hover {
    background-color: #555;
    color: white;
}</style>
</head>
<body>
<ul>
<div class="topnav">
<li><a class="active"  href="#home">Home</a></li>
<li><a href="#news">News</a></li>
<li><a  href="#contact">Contact</a></li>
<li><a href="#about">About</a></li>
</ul>

<%@ include file="navbar" %>
<h1>Page 2</h1>
</body>
</html>