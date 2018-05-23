package modelo;

import java.util.ArrayList;

public class ContaCorrente extends Conta {
	private double valorManutencao;
	private ArrayList<Historico> operacoes;
	
	public ContaCorrente(Agencia agencia, String data, int codigo, double saldo) {
		super(agencia, data, codigo, saldo);
		this.setValorManutencao(0.0);
		this.operacoes = new ArrayList<Historico>();
	}
	
	public ContaCorrente() {
		super();
	}
	
//	funcionalidades
	public void adicionarMovimentacao(){
		
	}
	
	public void mostrarDados() {
		System.out.println("Valor da manutenção: " + this.getValorManutencao());
	}
	
	
//	getters e setters
	public double getValorManutencao() {
		return valorManutencao;
	}
	public void setValorManutencao(double valorManutencao) {
		this.valorManutencao = valorManutencao;
	}
	public ArrayList<Historico> getOperacoes() {
		return operacoes;
	}
	public void setOperacoes(ArrayList<Historico> operacoes) {
		this.operacoes = operacoes;
	}
	
	
	
}