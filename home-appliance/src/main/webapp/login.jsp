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
        <span id="span">User Registration</span>

            <form action="login">
  <h2>Login</h2>
                LoginId:<br>
            <input type="email" name="loginId"><br>
            password:<br>
            <input type="password" name="password"><br><pre></pre>
            <button type="submit" value="submit">Login</button><br>
            <h4>New User? <a href="index.jsp">Register Here</a></h4>
            <h4><a href="getAllUsers">Get Users List</a></h4>
            <h2> ${ login } </h2>
        </form>
    </body>
    </html>