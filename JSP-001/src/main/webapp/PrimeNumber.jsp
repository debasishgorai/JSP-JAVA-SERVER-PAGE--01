<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prime Number</title>
</head>
<body>
     <%!     
     static String isPrime(int num){
    	 if(num<=1)
    		 return"Not Prime";
    	 
    	 for(int i=2;i<=num/2;i++){
    		 if(num%i==0){
    			 return "Prime";
    		 }
    	 }
    	 return "Prime";
     }
     
     %>
     <%!  String b=isPrime(67); %>            
       <h1><%=  b %></h1>         
                 
                 
                 
                 
                 
                 
</body>
</html>