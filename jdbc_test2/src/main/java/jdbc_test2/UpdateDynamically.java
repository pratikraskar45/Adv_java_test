package jdbc_test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDynamically {
	
	//and try updating data in dynamic way,
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Data from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Player No");
		int pno = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character
		System.out.println("Enter a player name");
		String name = scanner.nextLine(); // Use nextLine() to read the whole line
		System.out.println("Enter a player runs");
		double runs = scanner.nextDouble();
		
		//1-load or register the driver
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 //2-establish connection
		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test2", "root", "root");
		 
		 //3-create statement
		 PreparedStatement preparedStatement=connection.prepareStatement("update cricket set name=?,runs=? where pno =?");
		 preparedStatement.setString(1, name);
		 preparedStatement.setDouble(2, runs);
		 preparedStatement.setInt(3, pno);
		 
		 //4-execute statement
		 int count= preparedStatement.executeUpdate(); //return integer
		 
		 
		 //5-close connection
		 connection.close();
		 
		 System.out.println(count+"rows updated data dynamic way succesfully");
		
	}

}
