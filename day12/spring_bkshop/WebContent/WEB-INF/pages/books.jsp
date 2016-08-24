<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	${sb.subject.toUpperCase()} Books
	<hr/>
	<form:form action="/spring_bkshop/book/addcart" method="post" modelAttribute="bks">
		<form:checkboxes items="${bks.bookList}" itemValue="bookid" itemLabel="name" path="book" delimiter="<br>"/>
		<br/><br/>
		<input type="submit" value="Add To Cart"/>
	</form:form>
	
