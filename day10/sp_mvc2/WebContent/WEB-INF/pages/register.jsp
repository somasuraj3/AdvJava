<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New User</title>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
.statusblock {
	color: #000;
	background-color: #ffffaa;
	border: 2px solid #000000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
	<sf:form modelAttribute="user" action="register">
		<sf:errors path="*" cssClass="errorblock" element="div" />
		<c:if test="${!empty status}">
			<div class="statusblock">${status}</div>
		</c:if>
		<table>
			<tr>
				<td>User Name:</td>
				<td><sf:input path="username"/></td>
				<td><sf:errors path="username" cssClass="error"/> </td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><sf:input path="password"/></td>
				<td><sf:errors path="password" cssClass="error"/> </td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><sf:input path="email"/></td>
				<td><sf:errors path="email" cssClass="error"/> </td>
			</tr>
			<tr>
				<td>Birth:</td>
				<td><sf:input path="birth"/></td>
				<td><sf:errors path="birth" cssClass="error"/> </td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><sf:input path="age"/></td>
				<td><sf:errors path="age" cssClass="error"/> </td>
			</tr>
			<tr align="center">
				<td>
					<input type="submit" value="Register"/>
				</td>
			</tr>
		</table>
	</sf:form>
</body>
</html>
