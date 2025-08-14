package jdbc_concept;

import java.sql.*;

public class RetriveRecord {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/june10","root","root");
			Statement stmnt=con.createStatement();
			ResultSet result=stmnt.executeQuery("select * from student");
			while(result.next()){
				System.out.println("Hello");
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));

			}
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
