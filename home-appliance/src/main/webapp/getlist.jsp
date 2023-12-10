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
</head>
<body>
<a href="login.jsp" id="homeButton">Home</a><br>

    <table>
        <tr>
            <th>Sl.No</th>
            <th>User name</th>
            <th>Password</th>
            <th>Login Id</th>
            <th>Appliance Name</th>
            <th>Material Type</th>
            <th>Action</th>
            <th>Deed</th>
        </tr>
    < c:forEach items="${ users }" var="user">
        <tr>
            <td>${ user.getId() }</td>
            <td>${ user.getUserName() }</td>
            <td>${ user.getPassword() }</td>
            <td>${ user.getLoginId() }</td>
            <td>${ user.getApplianceName() }</td>
            <td>${ user.getMaterialType() }</td>
            <td><a href="update?passportId=${ user.getId() }">Update</a></td>
                        &nbsp; &nbsp; &nbsp;
            <td><a href="delete?passportId=${ user.getId() }">Delete</a></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>