<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>XML LIBRARY DEMO</h1>

<c:set var="books">
	<books>
		<book>
			<name>The Complete Reference</name>
			<author>Mac Grow Hill</author>
		</book>
		
		<book>
			<name>The Origin of Species</name>
			<author>Charls Darvin</author>
		</book>
	</books>
</c:set>


<x:parse xml="${books }" var="data"></x:parse>
1st book Name: <x:out select="$data/books/book[1]/name"/><br>
2nd book Author Name: <x:out select="$data/books/book[2]/author"/><br>

</body>
</html>