<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<form name='f' action="<c:url value='j_spring_security_check' />"
	method='POST'>

	<table>
		<tr>
			<td>User:</td>
			<td><input type='text' name='j_username' value='' >
			</td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type='password' name='j_password'/>
			</td>
		</tr>
		<tr>
			<td colspan='2'>
				<input name="submit" type="submit" value="submit" />
				<input name="reset" type="reset" />
			</td>
		</tr>
	</table>
</form>
