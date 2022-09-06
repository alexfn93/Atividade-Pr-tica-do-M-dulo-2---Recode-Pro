package teste_dao_promocoes;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.PromocoesDAO;

public class TesteDAORead {
	
	model.Promocoes promocoes = new model.Promocoes();
	
	static PromocoesDAO dao = new PromocoesDAO();

	public static void main(String[] args) {
		
	try {
		ResultSet resultado= dao.getPromocoes();
		while (resultado.next()) {
	    	System.out.println("Id Promocoes: "+resultado.getString(1)+" "+"\nOrigem: "+resultado.getString(2)+" "+"\nDestino: "+resultado.getString(3)+" "+"\nData de ida: "+ resultado.getString(4)+" "+"\nData de volta: "+ resultado.getString(5)+" "+"\nHotel: "+ resultado.getString(6)+" "+"\nLinha aerea: "+ resultado.getString(7)+" "+"\nValor: "+ resultado.getString(8)+" "+"\nDesconto: "+ resultado.getString(9)+" "+"\nId clientes_idclientes: "+resultado.getString(10)+" "+"\nId destino_iddestino: "+resultado.getString(11)+" "+"\nId destino_clientes_idclientes: "+resultado.getString(12)+" "+"\n");
	    }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }

}