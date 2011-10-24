<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>



<html>
<head>
</head>
<body>
	<h1>Cloud SQL with Struts + Spring + Hibernate</h1>

	<h2>Add Customer</h2>
	<div style="color: red"></div>

	<form name="customerForm" method="post" action="/addCustomer.do">

		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="customer.label.name" />
				:
			</div>
			<input name="name" id="name" size="40" maxlength="20"  type="text"/>		
		</div>

		<div style="padding: 16px">
			<div style="float: left; width: 100px;">
				<bean:message key="customer.label.address" />
				:
			</div>
			<textarea name="address" id="address" cols="50" rows="10"></textarea>		
		</div>

		<div style="padding: 16px">
			<div style="float: left; padding-right: 8px;">
				<input type="submit" value="Submit" />					
			</div>
			<input type="reset" value="Reset" />	
		</div>

	</form>

</body>
</html>