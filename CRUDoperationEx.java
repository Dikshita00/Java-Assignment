package jdbc_concept;

import java.sql.*;

public class CRUDoperationEx {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/june10","root","root");
			Statement smntp=con.createStatement();
			smntp.executeUpdate("insert into student values('Demon','105','Salvator@gmail.com','789789686')");
			smntp.executeUpdate("delete from student where email ='aster@gmail.com'");
			smntp.executeUpdate("update student set email='mikalsan@gmail.com' where email='hope@gmail.com'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
