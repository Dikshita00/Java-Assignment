package jdbc_concept;

import java.sql.*;
import java.util.Scanner;

public class UserInputDelete {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter roll number which you want to delete.");
			String roll=sc.next();
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/june10","root","root");
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("delete from student where roll='"+roll+"'");
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
