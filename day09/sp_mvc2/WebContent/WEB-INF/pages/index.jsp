<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Login Page</h3>
	<sf:form modelAttribute="login" action="login">
		UserName: <sf:input path="username"/> <br/><br/>
		Password: <sf:password path="password"/> <br/><br/>
		<input type="submit" value="Sign In"/>
	</sf:form>
</body>
</html>



