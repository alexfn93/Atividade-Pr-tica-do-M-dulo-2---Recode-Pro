package teste_dao_clientes;


import dao.ClientesDAO;

public class TesteDAOUpdate {

	public static void main(String[] args) {
		
		model.Clientes clientes = new model.Clientes();
				
		ClientesDAO dao = new ClientesDAO();
				
		clientes.setIdclientes(2);
		clientes.setNome("Alessandra");
		clientes.setSobreome("Maria");
		clientes.setDataNascimento("19/03/1981");
		clientes.setCpf("198.343.234-70");
		clientes.setNaturalidade("Minas Gerais");
		clientes.setNacionalidade("brasileira");
		clientes.setSexo("outro gênero");
		clientes.setEmail("am@recode.com.br");
		clientes.setCelular("+55(31)98884-9777");
		
		dao.update(clientes);
		System.out.println("Contato alterado com sucesso!");

			}

		}
