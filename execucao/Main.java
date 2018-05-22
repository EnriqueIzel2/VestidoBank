package execucao;

import modelo.Agencia;
import modelo.Banco;
import modelo.Cliente;

public class Main {

	public static void main(String[] args) {
		Banco bank = new Banco();
		Agencia ag = new Agencia();
		Cliente cl1 = new Cliente("String nome", "String endereco", "String cpf", "String data", "String fone");
		
		bank.cadastrarAgencia(ag);
		ag.cadastrarCliente(cl1);
		ag.mostrarClientes();
		ag.excluirCliente(cl1);

	}

}