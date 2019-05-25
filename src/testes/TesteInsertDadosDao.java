package testes;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteInsertDadosDao {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setNome("Mané");
		cliente.setEmail("m@m.com");
		cliente.setEndereco("Rua 2, 500");
		
		ClienteDao dao = new ClienteDao();
		
		dao.inserir(cliente);
		
		System.out.println("Cliente gravado com sucesso!");
	}
}