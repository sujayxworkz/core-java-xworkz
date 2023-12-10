<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>First JSP</title>
<h3><a href="login.jsp">Home</a></h3>
</head>
<body>
<h2><%=request.getAttribute("userRegistration")%></h2><br>
</body>
</html>