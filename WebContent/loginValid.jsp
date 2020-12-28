<%@ page import="com.model.Login,com.service.UserService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
UserService userService = new UserService();

Login log = new Login(request.getParameter("uname"), request.getParameter("email"));

boolean res = userService.login(log,request,response);

out.println(res);

%>

</body>
</html>