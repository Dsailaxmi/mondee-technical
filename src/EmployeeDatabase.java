
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class EmployeeData{
	Scanner sc=new Scanner(System.in);
	void insert(Statement st) throws SQLException{
		System.out.println("Enter empid");
		System.out.println("Enter empname");
		System.out.println("Enter empsalary");
		int empid=sc.nextInt();
		String empname=sc.next();
		int empsalary=sc.nextInt();
		int x=st.executeUpdate("insert into Emp values("+empid+",'"+empname+"',"+empsalary+")");
		if(x!=0) {
			System.out.println("record inserted");
		}
		
	}
	void update(Statement st) throws SQLException{		
		int x=st.executeUpdate("update Emp set empsalary=empsalary+"+1000+" ");
		if(x!=0) {
			System.out.println("record updated");
		}
		
	}
	void delete(Statement st) throws SQLException{		
		int eid=sc.nextInt();
		int x=st.executeUpdate("delete from Emp where empid= "+eid+" ");
		if(x!=0) {
			System.out.println("record deleted");
		}	
	}
	void select(Statement st) throws SQLException{		
		ResultSet rs=st.executeQuery("select * from Emp");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
			System.out.println("display successfully");
		}
		
	}
}
public class EmployeeDatabase {
	private static char ch;

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Employee";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("connection Established");
		Statement st=connection.createStatement();
		EmployeeData display=new EmployeeData();
		char ch=' ';
		while(ch!='n') {
			System.out.println("MENU");
			System.out.println("Employee database:");
			System.out.println("Enter your choice:\n 1. insert \n 2. update \n 3.delete \n 4.select \n 5.Exit");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			switch(num) {
			case 1:
				display.insert(st);
				break;
			case 2:
				display.update(st);
				break;
			case 3:
				display.delete(st);
				break;
			case 4:
				display.select(st);
				break;
			default:
				System.out.println("invalid input");
			}
			System.out.println("DO YOU WANT TO CONTINUE? Y/N");
			ch=sc.next().charAt(0);
			if(ch=='n') {
				System.out.println("Exit");
			}
		}
}
}