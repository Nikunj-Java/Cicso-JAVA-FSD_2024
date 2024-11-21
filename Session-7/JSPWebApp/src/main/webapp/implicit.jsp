<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	String responceCheck=request.getParameter("office");
	if(responceCheck!=null){
		response.setStatus(response.SC_MOVED_TEMPORARILY);
		response.setHeader("Location", "response-redirect.jsp?office="+responceCheck);
	}
%>

<%
String error=request.getParameter("error");
if(error!=null){
	throw new RuntimeException("Exception Occured");
}
%>

<a href="implicit.jsp?error=1">Use of Exception Object</a>

<a href="implicit.jsp?office=head_office">Use of Response Object</a>
</body>
</html>