<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- put this : commandName="myCommand"inside-->
	<form:form action="add.html" method="post">
		
		<form:label path="name">Name</form:label>
		<form:input path="name"/>

		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName"/>
		
		<input type="submit" value="say hi"/>
				
	</form:form>
</body>
</html>