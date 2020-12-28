<%@ page import = "com.model.Registration" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
Welcome : 
<% Registration reg =  (Registration )session.getAttribute("sesname");
out.println(reg.getUname() + " " + reg.getEmail() + " " + reg.getCity());
%> 
<br/>

<a href ="login.html">login</a>
</body>
</html>