<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<div>
		<sf:form modelAttribute="itp" action="addcart">
			<div>
				Item Name: ${it.name}
			</div>
			<div>
				Item Type: ${it.type} -- ${it.category}
			</div>
			<div>
				Description: ${it.description}
			</div>
			<div>
				<%--
				<ul>
					<c:forEach var="ip" items="${it.priceList}">
						<li>
							${ip.sizes} -- Rs. ${ip.price}/-
						</li>
					</c:forEach>
				</ul>
				--%>
				<sf:radiobuttons path="id" 
						items="${it.priceList}" 
						delimiter="<br/>"
						itemLabel="sizeAndPrice"
						itemValue="id"
						/>				
			</div>
			<input type="submit" value="Add Cart"/>
		</sf:form>
	</div>


