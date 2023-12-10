<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="ref" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<h4>Home Page</h4>
<title>First JSP</title>
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
   <table>
        <tr>
            <th>Sl.No</th>
            <th>Login Id</th>
            <th>Password</th>
            <th>User name</th>
            <th>Arrival Time</th>
            <th>Departure Time</th>
            <th>Transport Name</th>
            <th>State Name</th>
            <th>Action</th>
            <th>Deed</th>
        </tr>
    < ref:forEach items="${ users }" var="user">
        <tr>
            <td>${ user.getId() }</td>
            <td>${ user.getLoginId() }</td>
            <td>${ user.getPassword() }</td>
            <td>${ user.getUserName() }</td>
            <td>${ user.getArrivalTime() }</td>
            <td>${ user.getDepartureTime() }</td>
            <td>${ user.getTransportName() }</td>
            <td>${ user.getStateName() }</td>
            <td><a href="update?transportId=${ user.getId() }">Update</a></td>
                                    &nbsp; &nbsp; &nbsp;
            <td><a href="delete?transportId=${ user.getId() }">Delete</a></td>
        </tr>
        </ref:forEach>
    </table>
    <h3> ${ delete } </h3>
    </body>
</html>