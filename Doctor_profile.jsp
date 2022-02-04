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
<td>NAME</td>
<td>EMAIL</td>
<td>PHONE</td>
<td>SPECIALIST</td></tr>
<%
Connection connection=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/sailaxmi";
String user="root";
String pass="root";
connection=DriverManager.getConnection(url,user,pass);
int id=(Integer)session.getAttribute("id");
ps=connection.prepareStatement("select * from doctor where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>
<tr>
<td><%=rs.getInt(1) %></td><td> <%=rs.getString(2)%></td><td> <%=rs.getString(4) %></td><td><%=rs.getInt(5) %></td><td><%=rs.getString(6) %></td></tr>

<% } %>
</table>
</body>
</html>