<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<style>
       body{
            border: 5cm;
border-color: blueviolet;
background-color:rgb(243, 243, 178);
}

label{
   align-items: center;
  justify-content: center;
}

form{
    border: 3px solid green;
    background-color:rgb(199, 215, 240);
margin-top: 1%;
margin-right: 25%;
margin-left: 25%;
margin-bottom: 2%;
text-align: center;
}


h2{
    background-color: rgb(235, 172, 127);
    text-align: center;

}

#b1{
    margin-bottom: 1%;
    width: 2.0cm;
    height: 0.8cm;
    background-color: rgb(169, 236, 102);
}

</style>
</head>
<body>
<h2>Transport System</h2>
<form action="updateUser" method="post">
    <h3 style="display : none"><input type="text" name="id" id="id" value="${transport.getId()}" style="display : none"></h3>
    TransportName: <input type="text" name="transportName"><br><pre></pre>
    stateName: <input type="text" name="stateName"><br><pre></pre>
     LoginId:<input type="email" name="loginId"><br><pre></pre>
     password:<input type="password" name="password"><br><pre></pre>
     UserName:<input type="text" name="userName"><br><pre></pre>
    ArrivalTime: <input type="text" name="arrivalTime"><br><pre></pre>
    DepartureTime: <input type="text" name="departureTime"><br><pre></pre>
    <button type="submit" id="b1" value="submit">Submit</button>
</form>
</body>
</html>