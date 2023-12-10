<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
  table{
            border: solid springgreen;
            border-collapse: collapse ;
            border-radius: 20px;
         }
         th{
            border: solid rgb(223, 170, 132);
            background-color: rgb(220, 199, 172);
         }

        td{
            border: solid rgb(223, 170, 132);
            background-color: rgb(172, 201, 202);
            text-align: center;
        }
        </style>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<a width="3cm" height="3cm" href="login.jsp"><i class="fas fa-home fa-2x" ></i></a><br><pre>  </pre>

    <table>
        <tr>
            <th>Sl.No</th>
            <th>Passport Office</th>
            <th>Given Name</th>
            <th>SurName</th>
            <th>Email</th>
            <th>Login Id</th>
            <th>Password</th>
            <th>Confirm Password</th>
            <th>Hint Question</th>
            <th>Hint Answer</th>
            <th>Action</th>
        </tr>
    < c:forEach items="${ users }" var="user">
        <tr>
            <td>${ user.getId() }</td>
            <td>${ user.getPassportOfficeName() }</td>
            <td>${ user.getGivenName() }</td>
            <td>${ user.getSurName() }</td>
            <td>${ user.getEmail() }</td>
            <td>${ user.getLoginMail() }</td>
            <td>${ user.getPassword() }</td>
            <td>${ user.getConfirmPassword() }</td>
            <td>${ user.getHintQuestionName() }</td>
            <td>${ user.getHintAnswerName() }</td>
            <td><a href="update?passportId=${ user.getId() }">Update</a>
                        &nbsp; &nbsp; &nbsp;
            <a href="delete?passportId=${ user.getId() }">Delete</a></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>