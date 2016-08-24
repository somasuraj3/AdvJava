<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Pizza Menu</h3>
	<a href="showcart">Show Cart</a>
	<ul>
		<c:forEach var="type" items="${typeList}">
			<li>
				<c:url var="tempUrl" value="menu?type=${type}"/>
				<a href="${tempUrl}">${type}</a>
			</li>
		</c:forEach>
	</ul>
	
	<ul>
		<c:forEach var="cat" items="${categoryList}">
			<li>
				<c:url var="tempUrl" value="menu?type=${param.type}&category=${cat}"/>
				<a href="${tempUrl}">${cat}</a>
			</li>
		</c:forEach>
	</ul>
	
	<ul>
		<c:forEach var="item" items="${itemList}">
			<li>
				<c:url var="tempUrl" value="showitem?id=${item.id}"/>
				<a href="${tempUrl}">${item.name}</a>			
			</li>
		</c:forEach>
	</ul>
</body>
</html>


