package jdbc_test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatic {
	
	//create a db and table and 

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//1-load or register the driver(string class name) 
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	 //2-establish connection 
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test2", "root", "root"); 
	
	//3-create statement
	Statement statement=connection.createStatement();
	
	
	//4-execute statement
	//1st inserted
	// statement.execute("insert into cricket values (45,'Rohit Sharma',86) ");
	//2nd inserted
	statement.execute("insert into cricket values (1,'KL Rahul',51) ");
	
	//5-close connection
	connection.close();
	
	System.out.println("Done inserted");
	}
	}


