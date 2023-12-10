<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
<html>
<head>
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link href="passport.css" rel=  "stylesheet">
  <script src="passport.js"></script>
</head>
<body>
<a width="3cm" height="3cm" href="login.jsp"><i class="fas fa-home fa-2x" ></i></a>
  <form  action="passport" method="post">
    <h2 style="color: rgb(229, 14, 229);">User Registration</h2><br>
    Register to apply at :<label>CPV Delhi<input type="radio" name="officeName">
    Passport Office<input type="radio" name="officeName"></label><br><pre></pre>
    <label>Passport Office :
      <select name="passportOfficeName">
        <option>Select</option>
        <option>Bengaluru</option>
        <option>Chennai</option>
        <option>Hyderabad</option>
        <option>Mumbai</option>
        <option>Delhi</option>
      </select>
    </label><br><pre></pre>
    <label>Given Name :<input type="text" name="givenName"  placeholder="Your First Name" id="firstNameId" onblur="validateMainName()"></label>
    <span id="firstNameDisplay1" style="color: red;"> </span>
    <span id="firstNameDisplay2" style="color: red;"> </span><br><pre></pre>
    <label >Surname :<input type="text" name="surName" placeholder="Your  SurName"></label><br><pre></pre>
    <label>Date Of Birth :<input type="date" name="dob"></label><br><pre></pre>

    <label>Email Id :</span><input type="text" name="email" id="emailId" onblur="validateEmail()"></label>
    <span id="emailIdDisplay1" style="color: red;"> </span>
    <span id="emailIdDisplay2" style="color: red;"> </span><br><pre></pre>

    <label>Do you want your Login Id
      <input type="radio" name="mailId" id="id1" value="yes" onclick="handleRadio('yes')">yes
      <input type="radio" name="mailId" id="id2" value="no" onclick="handleRadio('no')">no
      <br>
      to be same as E-mail Id? :
    </label><br><pre></pre>

    <label>Login Id :<span class="required"></span>
      <input type="text" name="loginMail" id="loginId"></label><br><pre></pre>

    <label  id="passSpan1">password :<input type="password" name="password"></label><span id="show"></span><br><pre></pre>
    <label  id="passSpan2">confirm password :<input type="password" name="confirmPassword"></label><span id="show1"></span><br><pre></pre>
    <label>Hint Question :
      <select name="hintQuestionName">
        <option>select</option>
        <option>birth city</option>
        <option>favourite color</option>
        <option>favourite food</option>
        <option>first school</option>
      </select>
    </label><br><pre></pre>
    <label>Hint Answer :<input type="text" name="hintAnswerName"></label><br><pre></pre>
    <label><button style="color: rgb(245, 58, 11);" id="b1" type="submit" value="submit">Register</button>
    </label>
    <label><button style="color: rgb(245, 58, 11);" id="b1" type="reset" value="reset">Clear</button></label>
  </form>
</body>
<footer>
  <p>© Content Owned by Ministry of External Affairs, Government of India</p>
  <p>Site Maintained by Tata Consultancy Services Ltd.</p>
</footer>
</body>
        </html>