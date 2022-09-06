package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionMySql;
import model.Destino;


public class DestinoDAO {
	
     private Connection connection;
	

	public DestinoDAO() {
		this.connection = new ConnectionMySql().getConnection();
	}
	

	//Create
	public void save (Destino destino) {
		String sql = "INSERT INTO destino VALUES (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, destino.getIddestino());
			stmt.setString(2, destino.getOrigem());
			stmt.setString(3, destino.getDestino());
			stmt.setString(4, destino.getIdaData());
			stmt.setString(5, destino.getVoltaData());
			stmt.setString(6, destino.getHotel());
			stmt.setString(7, destino.getLinhaArea());
			stmt.setDouble(8, destino.getValor());
			stmt.setInt(9, destino.getClientes_idclientes());
			stmt.execute();
			stmt.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	//Read lista completa
		public ResultSet getDestino() throws SQLException {
			String sql = "SELECT * FROM destino";
			Statement stmt = null;
			ResultSet resultado = null;
			try {
				stmt = connection.createStatement();
				resultado =  stmt.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return resultado;
			
		}
	    
		//Update
		public void update(Destino destino) {
			String sql = "UPDATE destino SET  origem = ? , destino = ?, idaData = ?, voltaData = ?, hotel = ?, linhaArea = ?, valor = ?, clientes_idclientes = ? WHERE iddestino = ?";
			
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, destino.getOrigem());
				stmt.setString(2, destino.getDestino());
				stmt.setString(3, destino.getIdaData());
				stmt.setString(4, destino.getVoltaData());
				stmt.setString(5, destino.getHotel());
				stmt.setString(6, destino.getLinhaArea());
				stmt.setDouble(7, destino.getValor());
				stmt.setInt(8, destino.getClientes_idclientes());
				stmt.setInt(9, destino.getIddestino());
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	    
		//Delete
		public void removeById(int iddestino) {
			String sql = "DELETE FROM destino WHERE iddestino= ?";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setInt(1, iddestino);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		//Read ID
		public ResultSet getContatoById(int iddestino) throws SQLException {
			String sql = "SELECT * FROM destino where iddestino = ?";
			PreparedStatement stmt = null;
			ResultSet resultado = null;
			try {
				stmt = connection.prepareStatement(sql);
				stmt.setInt(1, iddestino);
				resultado =  stmt.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return resultado;
			
		}
	
}

	


