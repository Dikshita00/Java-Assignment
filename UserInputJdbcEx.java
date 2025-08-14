package jdbc_concept;

import java.sql.*;
import java.util.Scanner;

public class UserInputJdbcEx {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Roll no.");
			String roll=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter Mobile no.");
			String mobile=sc.next();
			//connect db
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/june10","root","root");
			//perform sql query execution
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("insert into student values('"+name+"','"+roll+"','"+email+"','"+mobile+"')");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
