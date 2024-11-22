<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Next Page</h1>


<jsp:useBean id="obj" class="com.simplilearn.demo.Employee" scope="session"></jsp:useBean>

<!-- let's call getter Method-->
EMPLOYEE ID: <jsp:getProperty property="emplId" name="obj"/>
NAME: <jsp:getProperty property="name" name="obj"/>
EMAIL:<jsp:getProperty property="email" name="obj"/>
PASSWORD: <jsp:getProperty property="password" name="obj"/>

</body>
</html>