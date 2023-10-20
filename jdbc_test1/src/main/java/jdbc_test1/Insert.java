package jdbc_test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	
	//crete a db and table and try inserting the data in a static way 
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1-load or register the driver(string class name) 
				Class.forName("com.mysql.cj.jdbc.Driver");   
				
				
	    //2-establish connection 
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test1", "root", "root");   
				
		//3-create statement
		Statement statement=connection.createStatement();
		//4-execute statement
		statement.execute("insert into customer values (1,'Mayur',7894561235) ");
		//5-close connection
		connection.close();
		System.out.println("aagya data ");
	}

}
