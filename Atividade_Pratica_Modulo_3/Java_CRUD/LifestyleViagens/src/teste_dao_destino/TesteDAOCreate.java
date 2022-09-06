package teste_dao_destino;


import dao.DestinoDAO;


public class TesteDAOCreate {

	public static void main(String[] args) {
	
		
	    model.Destino destino = new model.Destino();
	
	    destino.setIddestino(2);
		destino.setOrigem("Minas Gerais");
		destino.setDestino("New York - EUA");
		destino.setIdaData("22/11/2022");
		destino.setVoltaData("30/11/2022");
		destino.setHotel("New York Palace Hotel ");
		destino.setLinhaArea("Gol Linhas Aéreas");
		destino.setValor(3000);
		destino.setClientes_idclientes(2);
		
		
		
		
		
		DestinoDAO dao = new DestinoDAO();
		
	    dao.save(destino);
	    System.out.println("Contato salvo com sucesso!");
				
				

	}

}


