<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>First JSP</title>
 <style>
        form{
            text-align: center;
            border: solid 3px chocolate;
            background-color:cadetblue;
            margin-left: 20%;
            margin-right: 20%;
        }

    </style>
</head>
<body>
        <form action="login">
        <h2>Login</h2>
        LoginId:<br>
        <input type="text" name="loginMail"><br><pre></pre>
        Password:<br>
        <input type="password" name="password"><br><pre></pre>
        <button type="submit" value="submit">Login</button>
        <h4>New User? <a href="passport.jsp">Register Here</a></h4>
        <h4><a href="getUsers">Get UserList</a></h4>
        <h3> ${ login } </h3>
    </form>
</body>
</html>