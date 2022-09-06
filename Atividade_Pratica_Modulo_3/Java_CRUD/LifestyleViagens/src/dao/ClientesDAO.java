package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionMySql;
import model.Clientes;



public class ClientesDAO {
	
	private Connection connection;
	

	public ClientesDAO() {
		this.connection = new ConnectionMySql().getConnection();
	}
	

	//Create
	public void save (Clientes clientes) {
		String sql = "INSERT INTO clientes VALUES (?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, clientes.getIdclientes());
			stmt.setString(2, clientes.getNome());
			stmt.setString(3, clientes.getSobreome());
			stmt.setString(4, clientes.getDataNascimento());
			stmt.setString(5, clientes.getCpf());
			stmt.setString(6, clientes.getNaturalidade());
			stmt.setString(7, clientes.getNacionalidade());
			stmt.setString(8, clientes.getSexo());
			stmt.setString(9, clientes.getEmail());
			stmt.setString(10, clientes.getCelular());
			stmt.execute();
			stmt.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	//Read lista completa
		public ResultSet getClientes() throws SQLException {
			String sql = "SELECT * FROM clientes";
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
		public void update(Clientes clientes) {
			String sql = "UPDATE clientes SET  nome = ? ,sobrenome = ? , dataNascimento = ?, cpf = ?, naturalidade = ?, nacionalidade = ?, sexo = ?, email = ?, celular = ? WHERE idclientes = ?";
			
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, clientes.getNome());
				stmt.setString(2, clientes.getSobreome());
				stmt.setString(3, clientes.getDataNascimento());
				stmt.setString(4, clientes.getCpf());
				stmt.setString(5, clientes.getNaturalidade());
				stmt.setString(6, clientes.getNacionalidade());
				stmt.setString(7, clientes.getSexo());
				stmt.setString(8, clientes.getEmail());
				stmt.setString(9, clientes.getCelular());
				stmt.setInt(10, clientes.getIdclientes());
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	    
		//Delete
		public void removeById(int idclientes) {
			String sql = "DELETE FROM clientes WHERE idclientes= ?";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setInt(1, idclientes);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		//Read ID
		public ResultSet getContatoById(int idclientes) throws SQLException {
			String sql = "SELECT * FROM clientes where idclientes = ?";
			PreparedStatement stmt = null;
			ResultSet resultado = null;
			try {
				stmt = connection.prepareStatement(sql);
				stmt.setInt(1, idclientes);
				resultado =  stmt.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return resultado;
			
		}
	
}
