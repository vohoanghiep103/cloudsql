<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>


<html>
<head>
</head>
<body>
	<h1>Cloud SQL with Struts + Spring + Hibernate</h1>

	<h2>List All Customers</h2>

	<table border="1">
		<tr>			
			<th style="background-color: #CCFFCC; margin: 5px">Customer Name</th>
			<th style="background-color: #CCFFCC; margin: 5px">Address</th>
		</tr>


		<logic:iterate id="customer" name="dynaCustomerListForm"
			property="customerList">
			<tr>
				<td><bean:write name="customer" property="name" /></td>
				<td><bean:write name="customer" property="address" /></td>
			</tr>
		</logic:iterate>


	</table>

	<br />
	<br />
	<a href="/addCustomerPage.do">Add Customer</a><br>
	<a href="/customerPage.do">Search Customer</a><br>
	<a href="/listCustomer.do">List Customer</a>

</body>
</html>