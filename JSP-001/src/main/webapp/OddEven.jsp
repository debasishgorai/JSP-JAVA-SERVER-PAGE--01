<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OddEven Number</title>
</head>
<body>
<%!           public  static String isOddEven(int num){
	          if(num%2==0)  return "Even number";
	          else  
	                return "Odd Number";
	          
	          
	                }
	                %>
<%                 String res=isOddEven(13); %>
               <h1><%=  res %></h1>
</body>
</html>