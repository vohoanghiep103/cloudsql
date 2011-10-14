<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.util.List"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.google.appengine.api.rdbms.AppEngineDriver"%>

<html>
<body>
	<h2>Google App Engine with Cloud SQL</h2>
	<%
		String searchParam = request.getParameter("search");
		String query = null;
		if(searchParam == null || searchParam.equals("")){
			query = "SELECT guestName, content, entryID FROM entries";
		}else{
			query = "SELECT guestName, content, entryID FROM entries WHERE content LIKE '%" +searchParam+ "%'";
		}
		Connection c = null;
		c = DriverManager.getConnection("jdbc:google:rdbms://cloudsqlnew:cloudsql/guestbook");
		ResultSet rs = c.createStatement().executeQuery(query);
	%>

	<p>
		<strong>Sign the guestbook!</strong>
	</p>
	<form action="/search.jsp" method="post">
		<div>
			Search Message body Content: <input type="text" name="search" id="search"></input>
		</div>		
		<div>
			<input type="submit" value="Search" />
		</div>		
	</form>
	<b><a href="guestbook.jsp">Back</a></b><br>
	<br>
		<table style="border: 1px solid black">
		<tbody>
			<tr>
				<th width="35%" style="background-color: #CCFFCC; margin: 5px">Name</th>
				<th style="background-color: #CCFFCC; margin: 5px">Message</th>
				<th style="background-color: #CCFFCC; margin: 5px">ID</th>
			</tr>
			<%
				while (rs.next()) {
					String guestName = rs.getString("guestName");
					String content = rs.getString("content");
					int id = rs.getInt("entryID");
			%>

			<tr>
				<td><%=guestName%></td>
				<td><%=content%></td>
				<td><%=id%></td>
			</tr>

			<%
				}
				c.close();
			%>

		</tbody>
	</table>
	<br /> No more messages!
</body>
</html>