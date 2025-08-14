package jdbc_concept;

import java.sql.*;
import java.util.Scanner;

public class UserInputUpdate {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Name of the student whos roll no. you want to update.");
			String name=sc.next();
			System.out.println("update roll no.");
			String roll=sc.next();
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/june10","root","root");
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("update student set roll='"+ roll+" ' where name='"+name+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
