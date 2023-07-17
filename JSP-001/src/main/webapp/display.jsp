<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body><form  action="dev">
<%   HttpSession hs=request.getSession(); %>
<h1><%=  hs.getAttribute("n")    %></h1>
<h1><%=  hs.getAttribute("g")    %></h1>


<h1><%=  session.getAttribute("n")    %></h1>
<h1><%=  session.getAttribute("g")    %></h1>

</form>

</body>
</html>