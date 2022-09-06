package driver;

import java.sql.*;

public class Main {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/lifestyleviagens";
	private static final String USERNAME = "root";
	private static final String PASSWORD="22938830&Lurdicea60";

	public static void main(String[] args) {
		// Testando acesso ao BD
		
		try {
			Connection con = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
			
			if (con != null) {
				System.out.println("Está conectado");
			} else {
				System.out.println("Não conectou");
			}
			
			
			con.close();
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}


