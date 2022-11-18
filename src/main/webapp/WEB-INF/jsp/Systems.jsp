<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Security Demo</title>
</head>
<body>
	<h2>Welcome to Systems Meeting</h2>
	<!-- 
	<hr>
	User Name:
	<security:authentication property="principal.username" />
	<br> User Role(s):
	<security:authentication property="principal.authorities" />
	<hr>
	-->
	<hr>
	<p>
		Kindly assign 2 systems to CDC!!!
	</p>
	<hr>
	<a href="${pageContext.request.contextPath}/">Back</a>
	<!-- 
	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		<input type="Submit" value="logout">
	</form:form> 
	-->

</body>
</html>