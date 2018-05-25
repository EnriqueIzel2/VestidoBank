package execucao;

import modelo.Agencia;
import modelo.Banco;
import modelo.Cliente;
import modelo.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		Banco bank = new Banco();
		Agencia ag = new Agencia();
		Cliente cl1 = new Cliente("Pedro Feijão", "Rua de Cima", "034.231.222-90", "23/08/1988", "99294-8976");
//		Cliente cl2 = new Cliente("Carlos Feijão", "Rua de Cima", "034.231.222-90", "23/08/1988", "99294-8976");
		
		bank.cadastrarAgencia(ag);
		ag.cadastrarCliente(cl1);
//		ag.cadastrarCliente(cl2);
		cl1.abrirContaCorrente(ag, "23/05/2018", "12345", 190.00);
//		cl2.abrirContaPoupanca(ag, "22/3/1999", 321, 12.43, "32/3/4222", 12.8);
//		cl1.mostrarDados();
		ag.mostrarClientes();
//		c1.mostrarContas();
		
		

	}

}