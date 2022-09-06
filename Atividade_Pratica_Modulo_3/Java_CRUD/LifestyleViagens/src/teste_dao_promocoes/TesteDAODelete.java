package teste_dao_promocoes;

import dao.PromocoesDAO;

public class TesteDAODelete {

	public static void main(String[] args) {
		
		PromocoesDAO dao = new PromocoesDAO();
								
		dao.removeById(2);
        System.out.println("Contato removido com sucesso!");

	}

}