package modelo;

import java.util.ArrayList;

public class Agencia {
	private ArrayList<Cliente> clientes;
	
	public Agencia(){
		this.clientes = new ArrayList<Cliente>();
	}
	
//	funcionalidades
	public void cadastrarCliente(Cliente obj){
		this.clientes.add(obj);
		System.out.println("Cliente cadastrado com sucesso");
	}
	
	public void excluirCliente(Cliente obj){
		this.clientes.remove(obj);
		System.out.println("Cliente removido com sucesso");
	}
	
	public void editarCliente(String procurado, Cliente novo){
		for (int i = 0; i < this.clientes.size(); i++) {  // verifica se o cliente existe
			if (this.clientes.get(i).equals(procurado)) {
				this.clientes.remove(procurado);  // remove o cliente encontrado
				this.cadastrarCliente(novo);	  // cadastra o novo cliente
				System.out.println("Cliente cadastrado com sucesso");
			}
			else {
				System.out.println("A pessoa " + procurado + " não existe");
			}
		}
	}
	
	public void mostrarClientes(){
		if (this.clientes.size() > 0) {
			System.out.println("Clientes cadastrados");
			for (int i = 0; i < this.clientes.size(); i++) {
				System.out.println("Cliente nº " + (i + 1));
				this.clientes.get(i).mostrarDados();
			}
		}
		else {
			System.out.println("Não há clientes nessa agência");
		}
	}
}