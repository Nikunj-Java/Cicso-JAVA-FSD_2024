<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<html>
<body>
    <h1>Available Airlines</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Origin</th>
            <th>Destination</th>
            <th>Price</th>
            <th>Book</th>
        </tr>
        <c:forEach var="airline" items="${airlines}">
            <tr>
                <td>${airline.name}</td>
                <td>${airline.origin}</td>
                <td>${airline.destination}</td>
                <td>${airline.price}</td>
                <td>
                    <form action="bookTicket" method="post">
                        <input type="hidden" name="airlineId" value="${airline.id}" />
                        <input type="text" name="userName" placeholder="Your Name" required />
                        <input type="email" name="userEmail" placeholder="Your Email" required />
                        <button type="submit">Book</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
