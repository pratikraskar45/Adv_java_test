package jdbc_test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDynamically {
	
	//try inserting another data in a dynamic way,

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Player No");
		int pno = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character
		System.out.println("Enter a player name");
		String name = scanner.nextLine(); // Use nextLine() to read the whole line
		System.out.println("Enter a player runs");
		double runs = scanner.nextDouble();
		
		//1
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_test2","root", "root");
		//3
		PreparedStatement preparedStatement=connection.prepareStatement("insert into cricket values (?,?,?)");
		
		preparedStatement.setInt(1, pno);
		preparedStatement.setString(2, name);
		preparedStatement.setDouble(3, runs);
		//4
		preparedStatement.execute();
		
       //5-
		connection.close();
		System.out.println("inserted Done");
	}

}



