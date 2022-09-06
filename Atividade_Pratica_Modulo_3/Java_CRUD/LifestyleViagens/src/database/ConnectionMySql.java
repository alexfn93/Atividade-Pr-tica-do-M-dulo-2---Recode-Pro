package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySql {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/lifestyleviagens";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "22938830&Lurdicea60";
	
	public Connection getConnection() { 
	    try {
			return DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
}
