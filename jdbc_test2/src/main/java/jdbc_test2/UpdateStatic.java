package jdbc_test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatic {
	
	//try updating the data in static way,
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	//1-load or register the driver(string class name) 
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	
	 //2-establish connection 
	Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test2", "root", "root"); 
	
	
	//3-create statement
	Statement statement=connection.createStatement();
	
	
	//4-execute statement
	int count= statement.executeUpdate("update cricket set runs=19 where pno =1");
	
	
	//5-close connection
	connection.close();
	
	System.out.println(count+"row updated done");
	}
	}


