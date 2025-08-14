package jdbc_concept;

import java.sql.*;

public class InsertData {
	public static void main(String[] args) {
		try {
			//con 0nnect to DB
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/june10","root","root");
			System.out.println(con);
			
			//perform SQL query execution
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("insert into student values('caroline','101','caroline@gmail.com','98897868')");
			stmnt.executeUpdate("insert into student values('hope','102','hope@gmail.com','89878676')");
			stmnt.executeUpdate("insert into student values('klaus','103','klausmicalsan@gmail.com','767675667')");
			stmnt.executeUpdate("insert into student value('Aster','102','aster@gmail.com','978768678')");
			//close database connection
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
