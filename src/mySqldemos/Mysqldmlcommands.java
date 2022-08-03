package mySqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



/*
 * 1 create Connection
 * 2 create statement/query
 * 3 execute statement/query
 * 4 close connection 
 * */
 
public class Mysqldmlcommands {

	public static void main(String[] args) throws SQLException {
		// create connection the first step
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root"); 
        
		// create statement/query
		Statement stmt=con.createStatement(); 
		
		//String s="INSERT INTO STUDENT VALUES(103,'smith',34 )";
		
		//String s="UPDATE STUDENT SET SNAME='DAVID' WHERE SNO=103";
		
		String s="DELETE FROM STUDENT WHERE SNO=103";
		
		// execute statement/query
		
		stmt.execute(s);
		
		// close connection		
		con.close();
		
		System.out.println("query executed.............");
	}

}
