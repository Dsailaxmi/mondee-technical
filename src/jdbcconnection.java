
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/sailaxmi";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("connection Established");
		Statement st=connection.createStatement();
		int x=st.executeUpdate("insert into students values(110,'sailaxmi','sssssss','hyd')");
		if(x!=0)
			System.out.println("record inserted");
			
	}
}