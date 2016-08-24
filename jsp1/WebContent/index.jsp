<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function client_func() {
		// java script code
	}
</script>
</head>
<body>
	<%!
		int count = 0;
		public void jspInit() {
			System.out.println("jspInit() called");
		}
		public void jspDestroy() {
			System.out.println("jspDestroy() called");
		}	
	%>
	<h1>Hello JSP</h1>
	<h3>Date : <%= new Date() %></h3>
	<% count++; %>
	<% session.setAttribute("key", "value"); %>
	<% if(count % 2 == 0) { %>
		Even Count <%= count %>
	<% } else { %>
		Odd Count <%= count %>
	<% } %>
	
	<!-- HTML comment -->
	<%-- JSP comment --%>
</body>
</html>


