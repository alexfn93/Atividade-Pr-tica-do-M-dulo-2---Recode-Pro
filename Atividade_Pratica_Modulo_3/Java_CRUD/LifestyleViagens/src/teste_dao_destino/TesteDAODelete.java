package teste_dao_destino;

import dao.DestinoDAO;

public class TesteDAODelete {

	public static void main(String[] args) {
		
		DestinoDAO dao = new DestinoDAO();
								
		dao.removeById(2);
        System.out.println("Contato removido com sucesso!");

	}

}