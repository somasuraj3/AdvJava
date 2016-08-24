<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title"/></title>
</head>
<body>
	<table width="100%" border="1">
		<tr>
			<td>
				<tiles:insertAttribute name="header"/>
			</td>
		</tr>
		<tr>
			<td>
				<tiles:insertAttribute name="content"/>
			</td>
		</tr>
		<tr>
			<td>
				<tiles:insertAttribute name="footer"/>
			</td>
		</tr>		
	</table>
</body>
</html>

