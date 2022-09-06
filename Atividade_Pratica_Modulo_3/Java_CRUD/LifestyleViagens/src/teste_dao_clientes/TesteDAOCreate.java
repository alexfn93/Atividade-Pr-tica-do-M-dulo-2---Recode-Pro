package teste_dao_clientes;

import dao.ClientesDAO;

public class TesteDAOCreate {

	public static void main(String[] args) {
		
		
		model.Clientes clientes = new model.Clientes();
		
		clientes.setIdclientes(4);
		clientes.setNome("Ana");
		clientes.setSobreome("Luiza");
		clientes.setDataNascimento("10/01/2000");
		clientes.setCpf("119.245.882-44");
		clientes.setNaturalidade("São Paulo");
		clientes.setNacionalidade("brasileiro");
		clientes.setSexo("feminina");
		clientes.setEmail("analuiza00@outlook.com");
		clientes.setCelular("+55 (31) 98888-9999");
		
		
		ClientesDAO dao = new ClientesDAO();
		
	    dao.save(clientes);
	    System.out.println("Contato salvo com sucesso!");
				
				

	}

}
