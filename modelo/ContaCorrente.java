package modelo;

import java.util.ArrayList;

public class ContaCorrente extends Conta {
	private double valorManutencao;
	private ArrayList<Operacao> operacoes = new ArrayList<Operacao>();
	
	
	
	public void adicionarMovimentacao(){
		
	}
	
	public double getValorManutencao() {
		return valorManutencao;
	}
	public void setValorManutencao(double valorManutencao) {
		this.valorManutencao = valorManutencao;
	}
	public ArrayList<Operacao> getOperacoes() {
		return operacoes;
	}
	public void setOperacoes(ArrayList<Operacao> operacoes) {
		this.operacoes = operacoes;
	}
	
	
	
}