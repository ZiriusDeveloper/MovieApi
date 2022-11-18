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
<title>Admin Login Page</title>
</head>
<body>
<center>
	<h2>Welcome Admin!!!</h2>
	
	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		
		
		<input type="Submit" value="logout" style="float:right">
	</form:form>
	
	<br>
	<form:form action="${pageContext.request.contextPath}/insertNewEntries"
		method="POST">
		<input type="Submit" value="Add New Entries">
	</form:form>
	<form:form action="${pageContext.request.contextPath}/updateEntries"
		method="POST">
		<input type="Submit" value="Update Existing Entries" >
	</form:form>
	
	
	
	</center>
</body>
</html>