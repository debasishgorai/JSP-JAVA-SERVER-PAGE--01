<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Character</title>
</head>
<body>
<%!  
static int NoOfChar(String s){
	int count=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)!=' ')
			count++;
	}
	return count;
}
%>

<%      int num=NoOfChar("i am debasish"); %>
<h1 style="color:green"><%=   "No of char present-->"+num %></h1>
</body>
</html>