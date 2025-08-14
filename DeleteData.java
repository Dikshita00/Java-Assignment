package jdbc_concept;

//import java.sql.Connection;
import java.sql.*;

public class DeleteData {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/june10","root","root");
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("delete from student where name='mike'");
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
