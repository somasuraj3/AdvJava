<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<table border="1">
		<tr bgcolor="gray">
			<td>Book Id</td>
			<td>Name</td>
			<td>Author</td>
			<td>Subject</td>
			<td>Price</td>
		</tr>
		<c:forEach var="b" items="${sessionScope.cart}">
			<tr>
				<td>${b.bookid}</td>
				<td>${b.name}</td>
				<td>${b.author}</td>
				<td>${b.subject}</td>
				<td>${b.price}</td>
			</tr>
		</c:forEach>
	</table>
	<br/><br/>
	Total Price : ${bill}
	<br/><br/>
