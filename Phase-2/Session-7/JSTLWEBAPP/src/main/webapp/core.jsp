<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- download jstl1.2.jar file from: http://www.java2s.com/Code/Jar/j/Downloadjstl12jar.htm -->
<c:set var="income" value="${4000*50 }" scope="session"></c:set>

Income: <c:out value="${income }"></c:out><br>

<c:remove var="income"/>Income: <c:out value="${income }"></c:out><br>

<!-- Exception Handling -->

<c:catch var="ex">
	<% int c=10/0; %>
</c:catch>

Exception is: <c:out value="${ex }"></c:out><br>

<!-- if in jstl -->

<c:set var="test" value="700"></c:set>
<c:if test="${test>500 }">
	<c:out value="the value is more than 500"></c:out><br>
</c:if>

<!-- if and else -->

<c:choose>
	<c:when test="${test>1000 }">
		<c:out value="the value is more than 1000"></c:out><br>
	</c:when>
	<c:otherwise>
		<c:out value="the value is less than 1000"></c:out><br>
	</c:otherwise>
</c:choose>


<!-- for Loop in JSTL -->

<c:forTokens items="1,2,3,4,5,6,7,8,9,10" delims="," var="x">
	<c:out value="${x }"></c:out>
</c:forTokens>

</body>
</html>