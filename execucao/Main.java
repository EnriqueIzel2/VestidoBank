package execucao;

import modelo.Agencia;
import modelo.Banco;
import modelo.Cliente;
import modelo.Historico;

public class Main {

	public static void main(String[] args) {
		Banco bank = new Banco();
		Agencia ag = new Agencia();
		Cliente cl1 = new Cliente("Pedro Feijão", "Rua de Cima", "034.231.222-90", "23/08/1988", "99294-8976");
		Cliente cl2 = new Cliente("Carlos Feijão", "Rua de Cima", "034.231.222-90", "23/08/1988", "99294-8976");
		Historico ope = new Historico();
		
		bank.cadastrarAgencia(ag);
		ag.cadastrarCliente(cl1);
		ag.cadastrarCliente(cl2);
		cl1.abrirContaCorrente(ag, "23/05/2018", "12345", 190.00);
		cl2.abrirContaPoupanca(ag, "21/03/1999", "123", 100.00, "12/02/1999", 12);
		cl1.getCorrente().efetuarTransferencia(12, "12345");
		cl1.getCorrente().creditar(12);
		ag.mostrarClientes();
		cl1.getCorrente().mostrarOperacoes();


	}

}