package teste_dao_promocoes;

import dao.PromocoesDAO;

public class TesteDAOCreate {

	public static void main(String[] args) {
	
		
	    model.Promocoes promocoes = new model.Promocoes();
	
	    promocoes.setIdPromocoes(2);
		promocoes.setOrigem("Minas Gerais");
		promocoes.setDestino("New York - EUA");
		promocoes.setIdaData("22/11/2022");
		promocoes.setIdaVolta("30/11/2022");
		promocoes.setHotel("New York Palace Hotel ");
		promocoes.setLinhaArea("Gol Linhas Aéreas");
		promocoes.setValor(3000);
        promocoes.setDesconto(200);
		promocoes.setClientes_idclientes(2);
		promocoes.setDestino_iddestino(2);
		promocoes.setDestino_clientes_idclientes(2);
		
		
		
		
		
		PromocoesDAO dao = new PromocoesDAO();
		
	    dao.save(promocoes);
	    System.out.println("Contato salvo com sucesso!");
				
				

	}

}
