package teste_dao_promocoes;

import dao.PromocoesDAO;

public class TesteDAOUpdate {
	
public static void main(String[] args) {
		
		model.Promocoes promocoes = new model.Promocoes();
				
		PromocoesDAO dao = new PromocoesDAO();
				
		promocoes.setIdPromocoes(1);
		promocoes.setOrigem("Rio de Janeiro");
		promocoes.setDestino("Miami - EUA");
		promocoes.setIdaData("22/11/2022");
		promocoes.setIdaVolta("30/11/2022");
		promocoes.setHotel("New York Palace Hotel ");
		promocoes.setLinhaArea("Gol Linhas Aéreas");
		promocoes.setValor(3000);
		promocoes.setDesconto(300);
		promocoes.setClientes_idclientes(1);
		promocoes.setDestino_iddestino(1);
		promocoes.setDestino_clientes_idclientes(1);
		
		
		
		dao.update(promocoes);
		System.out.println("Contato alterado com sucesso!");

			}

		}


