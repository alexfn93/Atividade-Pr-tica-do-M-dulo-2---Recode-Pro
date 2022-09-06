package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionMySql;
import model.Promocoes;

public class PromocoesDAO {
	
	 private Connection connection;
		

		public PromocoesDAO() {
			this.connection = new ConnectionMySql().getConnection();
		}
		

		//Create
		public void save ( Promocoes promocoes) {
			String sql = "INSERT INTO promocoes VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setInt(1, promocoes.getIdPromocoes());
				stmt.setString(2, promocoes.getOrigem());
				stmt.setString(3, promocoes.getDestino());
				stmt.setString(4, promocoes.getIdaData());
				stmt.setString(5, promocoes.getIdaVolta());
				stmt.setString(6, promocoes.getHotel());
				stmt.setString(7, promocoes.getLinhaArea());
				stmt.setDouble(8, promocoes.getValor());
				stmt.setDouble(9, promocoes.getDesconto());
				stmt.setInt(10, promocoes.getClientes_idclientes());
				stmt.setInt(11, promocoes.getDestino_iddestino());
				stmt.setInt(12, promocoes.getDestino_clientes_idclientes());
				stmt.execute();
				stmt.close();	
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

		//Read lista completa
			public ResultSet getPromocoes() throws SQLException {
				String sql = "SELECT * FROM promocoes";
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
			public void update(Promocoes promocoes) {
				String sql = "UPDATE promocoes SET  origem = ? , destino = ?, idaData = ?, voltaData = ?, hotel = ?, linhaArea = ?, valor = ?, desconto = ?, clientes_idclientes = ?, destino_iddestino = ?, destino_clientes_idclientes = ?  WHERE idPromocoes = ?";
				
				try {
					PreparedStatement stmt = connection.prepareStatement(sql);
					stmt.setString(1, promocoes.getOrigem());
					stmt.setString(2, promocoes.getDestino());
					stmt.setString(3, promocoes.getIdaData());
					stmt.setString(4, promocoes.getIdaVolta());
					stmt.setString(5, promocoes.getHotel());
					stmt.setString(6, promocoes.getLinhaArea());
					stmt.setDouble(7, promocoes.getValor());
					stmt.setDouble(8, promocoes.getDesconto());
					stmt.setInt(9, promocoes.getClientes_idclientes());
					stmt.setInt(10, promocoes.getDestino_iddestino());
					stmt.setInt(11, promocoes.getDestino_clientes_idclientes());
					stmt.setInt(12, promocoes.getIdPromocoes());
					stmt.execute();
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		    
			//Delete
			public void removeById(int idPromocoes) {
				String sql = "DELETE FROM promocoes WHERE idPromocoes= ?";
				try {
					PreparedStatement stmt = connection.prepareStatement(sql);
					stmt.setInt(1, idPromocoes);
					stmt.execute();
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
			//Read ID
			public ResultSet getContatoById(int idPromocoes) throws SQLException {
				String sql = "SELECT * FROM destino where idPromocoes = ?";
				PreparedStatement stmt = null;
				ResultSet resultado = null;
				try {
					stmt = connection.prepareStatement(sql);
					stmt.setInt(1, idPromocoes);
					resultado =  stmt.executeQuery();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return resultado;
				
			}
		
	}
