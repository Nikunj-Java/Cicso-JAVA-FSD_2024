<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>USE BEAN EXAMPLE</h1>

<!-- id is the object of class -->
<jsp:useBean id="obj" class="com.simplilearn.demo.Employee" scope="session"></jsp:useBean>

<h3>Value Before Set</h3>

<!-- let's call getter  -->
EMMPLOYEE ID: <jsp:getProperty property="emplId" name="obj"/>
NAME: <jsp:getProperty property="name" name="obj"/>
EMAIL: <jsp:getProperty property="email" name="obj"/>
PASSWORD: <jsp:getProperty property="password" name="obj"/>

<!-- let's call setter -->

<!-- name means usebean object -->
 
<jsp:setProperty property="emplId" name="obj" value="121"/>
<jsp:setProperty property="name" name="obj" value="Nikunj Soni"/>
<jsp:setProperty property="email" name="obj" value="nikunj@gmail.com"/>
<jsp:setProperty property="password" name="obj" value="Nikunj@123"/>

<h3>Value After Set</h3>

<!-- let's call getter  -->
EMMPLOYEE ID: <jsp:getProperty property="emplId" name="obj"/>
NAME: <jsp:getProperty property="name" name="obj"/>
EMAIL: <jsp:getProperty property="email" name="obj"/>
PASSWORD: <jsp:getProperty property="password" name="obj"/>


<a href="next.jsp">Next page</a>

</body>
</html>