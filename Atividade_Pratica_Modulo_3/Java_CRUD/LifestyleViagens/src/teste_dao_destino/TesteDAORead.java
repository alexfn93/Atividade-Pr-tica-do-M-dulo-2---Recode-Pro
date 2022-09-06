package teste_dao_destino;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DestinoDAO;

public class TesteDAORead {
	
	model.Destino destino = new model.Destino();
	
	static DestinoDAO dao = new DestinoDAO();

	public static void main(String[] args) {
		
	try {
		ResultSet resultado= dao.getDestino();
		while (resultado.next()) {
	    	System.out.println("Id destino: "+resultado.getString(1)+" "+"\nOrigem: "+resultado.getString(2)+" "+"\nDestino: "+resultado.getString(3)+" "+"\nData de ida: "+ resultado.getString(4)+" "+"\nData de volta: "+ resultado.getString(5)+" "+"\nHotel: "+ resultado.getString(6)+" "+"\nLinha aerea: "+ resultado.getString(7)+" "+"\nValor: "+ resultado.getDouble(8)+" "+"\nId do cliente: "+ resultado.getInt(9)+"\n");
	    }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }

}