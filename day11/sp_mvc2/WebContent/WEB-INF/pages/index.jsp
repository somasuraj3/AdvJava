<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>
			<a href="index?locale=en">English</a>
		</li>
		<li>
			<a href="index?locale=hi">Hindi</a>
		</li>
	</ul>
	
	<h3> <s:message code="app.title"/> </h3>
	<sf:form modelAttribute="login" action="login">
		UserName: <sf:input path="username"/> <br/><br/>
		Password: <sf:password path="password"/> <br/><br/>
		<input type="submit" value="Sign In"/> 
		<a href="newuser">Sign Up</a>
	</sf:form>
</body>
</html>




