<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pizza Menu</title>
</head>
<body>
	Hello, ${lb.user}
	<hr/>
	<jsp:useBean id="mb" class="com.sh.pizza.MenuBean" scope="page"/>
	<jsp:setProperty name="mb" property="*"/>
	${mb.fetchTypes()}
	<ul>
		<c:forEach var="type" items="${mb.typeList}">
			<li>
				<a href="menu.jsp?type=${type}">${type}</a>
			</li>
		</c:forEach>
	</ul>
	
	${mb.fetchCategories()}
	${mb.fetchItems()}

	<ul>
		<c:forEach var="cat" items="${mb.categoryList}">
			<li>
				<a href="menu.jsp?type=${param.type}&category=${cat}">${cat}</a>
			</li>
			<c:if test="${param.category == cat}">
				<ul>
					<c:forEach var="item" items="${mb.itemList}">
						<li>
							<a href="item.jsp?id=${item.id}">${item.name}</a>
						</li>
					</c:forEach>
				</ul>				
			</c:if>
		</c:forEach>
	</ul>	
	
	
</body>
</html>


