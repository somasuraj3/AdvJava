<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<form:form action="/spring_bkshop/admin/addbook" method="post" modelAttribute="bk">
	<table>
		<tr>
			<td>Book Id : </td>
			<td><form:input path="bookid" /></td>
		</tr>
		<tr>
			<td>Name : </td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Author : </td>
			<td><form:input path="author" /></td>
		</tr>
		<tr>
			<td>Subject : </td>
			<td><form:input path="subject" /></td>
		</tr>
		<tr>
			<td>Price : </td>
			<td><form:input path="price" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Add Book"/></td>
		</tr>
		<tr>
			<td colspan="2" align="left">${book_add_status}</td>
		</tr>
	</table> 
</form:form>
