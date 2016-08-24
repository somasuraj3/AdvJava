<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<form:form action="/spring_bkshop/book/showbooks" method="post" modelAttribute="sb">
		<form:radiobuttons path="subject" delimiter="<br>" items="${sb.subList}"/> 
		<br/><br/>
		<input type="submit" value="Show Books"/>
	</form:form>
