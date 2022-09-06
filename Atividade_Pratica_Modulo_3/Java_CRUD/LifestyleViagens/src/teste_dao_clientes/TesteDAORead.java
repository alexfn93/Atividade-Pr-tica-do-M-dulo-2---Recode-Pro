package teste_dao_clientes;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ClientesDAO;

public class TesteDAORead {
	
	model.Clientes clientes = new model.Clientes();
	
	static ClientesDAO dao = new ClientesDAO();

	public static void main(String[] args) {
		
	try {
		ResultSet resultado= dao.getClientes();
		while (resultado.next()) {
	    	System.out.println("ID: "+resultado.getString(1)+" "+"\nNome Completo: "+resultado.getString(2)+" "+ resultado.getString(3)+" "+"\nData de nascimento: "+ resultado.getString(4)+" "+"\nCPF: "+ resultado.getString(5)+" "+"\nNaturalidade: "+ resultado.getString(6)+" "+"\nNacionalidade: "+ resultado.getString(7)+" "+"\nSexo: "+ resultado.getString(8)+" "+"\nNacionalidade: "+ resultado.getString(9)+"\nCelular: "+ resultado.getString(10)+"\n");
	    }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }

}