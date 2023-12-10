<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>First JSP</title>
</head>
<body>
<h3>Transport name is <%=request.getAttribute("transportname")%></h3>
<h3>State name is <%=request.getAttribute("statename")%></h3>
</body>
</html>