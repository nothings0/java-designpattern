package _21T1020546;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DbHelper {
	
	private Connection con = null;
	public Connection getConnection() {
		
		return this.con;
	}

	private static DbHelper _instance = new DbHelper();
	
	private DbHelper() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String connectionUrl = "jdbc:sqlserver://localhost;databaseName=YourDB;user=YourUsername;password=YourPassword";
		try {
			con = DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static DbHelper getInstance() {
		return _instance;
	}
}