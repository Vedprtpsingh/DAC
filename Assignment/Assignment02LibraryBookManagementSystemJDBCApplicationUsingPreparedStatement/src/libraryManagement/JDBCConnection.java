package libraryManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class JDBCConnection {
	public static PreparedStatement JDBCConnectWithJava(String q) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");			
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","cdacacts");
		PreparedStatement pmt=con.prepareStatement(q);
		return pmt;
	}
	public JDBCConnection() {
	}
}
