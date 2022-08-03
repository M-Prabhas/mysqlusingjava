package mySqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysqlselectcommand {

	public static void main(String[] args) throws SQLException {
		// create connection the first step
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root"); 
        
		// create statement/query
		Statement stmt=con.createStatement(); 
		
	
		
		String s="SELECT SNO,SNAME,MARKS FROM STUDENT";
		
		// execute statement/query and store data in result set
		
		
		ResultSet rs=stmt.executeQuery(s);
		
		// as we dont know the records in the schema 
		
		while(rs.next()) {
			int sid=rs.getInt("sno");
			String sname=rs.getString("sname");
			int marks=rs.getInt("marks");
			
			
			System.out.println(sid+"  "+sname+"  "+marks);
		}
		
		
		
		
		// close connection		
		con.close();
		
		System.out.println("query executed.............");
	}
}
