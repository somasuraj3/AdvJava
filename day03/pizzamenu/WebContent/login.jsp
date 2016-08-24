<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Check</title>
</head>
<body>
	<jsp:useBean id="lb" class="com.sh.pizza.LoginBean" scope="session"/>
	<jsp:setProperty name="lb" property="*"/>
	<c:choose>
		<c:when test="${lb.status == true}">
			<c:redirect url="menu.jsp"/>
		</c:when>
		<c:otherwise>
			Invalid username or password.<br/><br/>
			<a href="<c:url value="index.jsp"/>">Login Again</a>
		</c:otherwise>
	</c:choose>
</body>
</html>


