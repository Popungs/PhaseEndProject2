<%@ page import ="com.model.Login" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome!</title>
</head>
<body>
Welcome! : <%
Login log = (Login) session.getAttribute("sesname");
out.println(log);

%> <br/>

<a href ="Logout">logout</a>

</body>
</html>