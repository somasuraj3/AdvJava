<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<p>Menu</p>

<sec:authorize url="/book/**">
	<a href="/spring_bkshop/book/subjects">Subjects</a>	
	<br/>
	<a href="/spring_bkshop/book/showcart">Show Cart</a>
	<br/>
</sec:authorize>

<sec:authorize url="/admin/**">
	<a href="/spring_bkshop/admin/newbook">New Book</a>	
	<br/>
	<a href="/spring_bkshop/admin/modbook">Modify Book</a>	
	<br/>
</sec:authorize>

<a href="/spring_bkshop/logout">Log Out</a>
<br/>
