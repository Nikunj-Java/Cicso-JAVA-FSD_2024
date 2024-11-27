<%@page import="java.util.Date" %>
<%@page info="This is my page info" %>
<%@page buffer="16kb" %>
<%@page isThreadSafe="true" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>

<%= "Today is Date: "+new Date() %>

<br><br>

<h2>Expression Language</h2>

${'Hello World'}
<p>isEliIgnored=true  will not be able to read the tags nut isElIgnored=false will Read</p>

<br>
<br>

<h2>Include a File</h2>

<%@include file="test.jsp" %>
<%@include file="index.jsp" %>

<body>

</body>
</html>