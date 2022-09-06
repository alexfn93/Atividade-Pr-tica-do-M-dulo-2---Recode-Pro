package teste_dao_clientes;

import dao.ClientesDAO;

public class TesteDAODelete {

	public static void main(String[] args) {
		
		ClientesDAO dao = new ClientesDAO();
								
		dao.removeById(2);
        System.out.println("Contato removido com sucesso!");

	}

}