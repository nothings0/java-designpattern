package _T1020533;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
	
	private Connection con = null;
	public Connection getConnection() {
		return this.con;
	}

	private static DBHelper _instance = null;
	
	private DBHelper(String connectionUrl) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String connectionUrl = "jdbc:sqlserver://localhost;databaseName=BaiTap;user=sa;password=123456";
		try {
			con = DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static DBHelper getInstance(String connectionUrl) {
		if (_instance == null)
			_instance = new DBHelper(connectionUrl);
			
		return _instance;
	}
}