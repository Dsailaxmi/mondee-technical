<html>
<body bgcolor='wheat'>
<br><br>
<h1 align="center">Welcome to Doctor page
<br><br><br>
<a href="Doctor_profile.jsp">Doctor profile</a><br>
<a href="index.html">logout</a>
</h1>
<br><br>
<%@page import="java.sql.*" %>
<table border="2" width="400" height="200">
<tr>
<td>ID</td>
<td>PNAME</td>
<td>DATE</td>
<td>TIME</td>
<td>SPECIALIST</td>
<td>STATUS</td></tr>
<%
Connection connection=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/sailaxmi";
String user="root";
String pass="root";
connection=DriverManager.getConnection(url,user,pass);
String specialist=(String)session.getAttribute("specialist");
ps=connection.prepareStatement("select * from appointment where specialist=?");
ps.setString(1,specialist);
ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>
<tr>
<td><%=rs.getInt(1) %></td><td> <%=rs.getString("pname")%></td><td> <%=rs.getString("doa") %></td>
<td><%=rs.getString("toa") %></td><td><%=rs.getString("specialist") %></td>
<td><%=rs.getString("status") %></td>
<td><a href="accept.jsp?id=<%=rs.getInt(1)%>">Accept</a></td>
</tr>

<% } %>
</table>
</body>
</html>