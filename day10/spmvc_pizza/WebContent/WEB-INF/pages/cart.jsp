<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%--
<style type="text/css">
.div1 {
	border: 2px solid #000000;
}
.span1 {
	display: block;
}
</style>
--%>
<link rel="stylesheet" href="mycss/pizza.css"/>

</head>
<body>
	<%-- 
	<c:forEach var="ip" items="${sessionScope.cart}">
		<div style="border: 2px solid #000000">
			<span style="display: block;">Item : ${ip.item.name}</span>
			<span style="display: block;">Size : ${ip.sizes}</span>
			<span style="display: block;">Price : ${ip.price}</span>
		</div>
	</c:forEach>
	--%>
	<%--
	<c:forEach var="ip" items="${sessionScope.cart}">
		<div class="div1">
			<span class="span1">Item : ${ip.item.name}</span>
			<span class="span1">Size : ${ip.sizes}</span>
			<span class="span1">Price : ${ip.price}</span>
		</div>
	</c:forEach>
	--%>	
	<c:forEach var="ip" items="${sessionScope.cart}">
		<div class="div2">
			<span class="span2">Item : ${ip.item.name}</span>
			<span class="span2">Size : ${ip.sizes}</span>
			<span class="span2">Price : ${ip.price}</span>
		</div>
	</c:forEach>	
</body>
</html>


