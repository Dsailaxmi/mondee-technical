<html>
<body bgcolor='wheat'>
<br><br>
<h1 align="center">Welcome to patient home
<br><br><br>
<a href="apply_appointment.jsp">Apply Appointment</a><br>
<a href="appointment_applied.jsp">View Appointment</a><br>
<a href="index.html">Logout</a>
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
<td>STATUS</td>
<td>Doctor name</td></tr>
<%
Connection connection=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/sailaxmi";
String user="root";
String pass="root";
connection=DriverManager.getConnection(url,user,pass);

ps=connection.prepareStatement("select * from appointment");
ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>
<tr>
<td><%=rs.getInt(1) %></td><td> <%=rs.getString("pname")%></td><td> <%=rs.getString("doa") %></td>
<td><%=rs.getString("toa") %></td><td><%=rs.getString("specialist") %></td>
<td><%=rs.getString("status") %></td>
<td><%=rs.getString("dname") %>></td>
</tr>

<% } %>
</table>
</body>
</html>