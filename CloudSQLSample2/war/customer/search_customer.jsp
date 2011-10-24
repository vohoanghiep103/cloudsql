<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>



<html>
<head>
</head>
<body>
	<h1>Cloud SQL with Struts + Spring + Hibernate</h1>

	
	<h2>Search Customers</h2>
	
	<form method="post" action="/searchCustomer.do">

		<div style="padding: 16px">
			<div style="float: left; width: 100px;"><bean:message key="customer.label.name" />:</div>
			<input name="name" id="name" size="40" maxlength="20"  type="text"/>		
		</div>
		<div style="padding: 16px">
			<div style="float: left; padding-right: 8px;">
				<input type="submit" value="Submit" />					
			</div>
			<input type="reset" value="Reset" />	
		</div>
	</form>
	
	<br>
	<b>Search Query</b>: <textarea rows="1" cols="88">getHibernateTemplate().find("from Customer c WHERE c.name LIKE ?", "%"+customerName+"%");</textarea>

</body>
</html>