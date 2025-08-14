package jdbc_concept;
//executeUpdate() using this method we can only create update delete record but to retrive record we have to use executrQuery()
import java.sql.*;

public class UpdateRecordDB {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/june10","root","root");
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("update student set name='stefen' where email='aster@gmail.com'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
