package com.nhan.dbconnect;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private Connection con = null;
	public Connection getConnection() {
		return this.con;
	}

	private static DbConnection _instance = null;
	
	private DbConnection() throws IOException {
		String connectionUrl = this.getStringConnect();
		try {
			con = DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DbConnection getInstance() throws IOException {
		if (_instance == null)
			_instance = new DbConnection();
		System.out.println("Connect Db success");
		return _instance;
	}
	
	private String getStringConnect () throws IOException {
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\pv\\OneDrive\\Java\\baikiemtraso1\\src\\com\\nhan\\dbconnect\\config.ini");
			var br = new BufferedReader(fr);
			String line = br.readLine();
			br.close();
			fr.close();
			return line;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
