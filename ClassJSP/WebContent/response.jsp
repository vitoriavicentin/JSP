<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Response Page</title>
	</head>
	<body>
		<jsp:useBean id="user" scope="session" class="MyFirstPackage.BeanUser"/>
		<jsp:setProperty name="user" property="*"  />.
		
		<h1>Hello, <jsp:getProperty name="user" property="user"/> Welcome!</h1>
	</body>
</html>