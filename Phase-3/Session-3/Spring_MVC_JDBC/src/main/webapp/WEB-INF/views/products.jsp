<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Ecommerce Product List</h2>


<table>
	<tr>
		<th>ID</th><th>NAME</th><th>PRICE</th><th>DATE</th>
	</tr>
	<c:forEach var="p" items="${list }">
			<tr>
				<td>${p.id }</td>
				<td>${p.name }</td>
				<td>${p.price }</td>
				<td>${p.date_added }</td>
			</tr>
	</c:forEach>
</table>

</body>
</html>