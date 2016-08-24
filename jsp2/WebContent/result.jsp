<%@page import="com.sh.jsp2.CapBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--
		CapBean cb = new CapBean();
		cb.setUname( request.getParameter("user") );
	--%>
	
	<jsp:useBean id="cb" class="com.sh.jsp2.CapBean" scope="page"/>
	<%--<jsp:setProperty name="cb" property="uname" param="user"/>  --%>
	<jsp:setProperty name="cb" property="*"/>
		
	<%-- <% cb.convert(); %> --%>
	${ pageScope.cb.convert() }
	<%-- Result: <%= cb.getCapName() %> --%>
	<%-- Result: <jsp:getProperty name="cb" property="capName"/>  --%>
	Name: ${param.uname}
	Result: ${pageScope.cb.capName}
</body>
</html>



