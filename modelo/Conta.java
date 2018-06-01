package modelo;

import java.util.ArrayList;

public abstract class Conta {
	private double saldo;
	private String dataAbertura, codigo;
	private ArrayList<Historico> operacoes;
	
	public Conta(String data, String codigo, double saldo) {
		this.setDataAbertura(data);
		this.setCodigo(codigo);
		this.setSaldo(saldo);
		this.operacoes = new ArrayList<Historico>();
	}
	
	public Conta() {
		
	}
	
//	funcionalidades
	abstract public void creditar(double quantia);
	
	abstract public void debitar(double quantia);
	
	abstract public void efetuarTransferencia(double quantia, String destino);
	
	abstract public void mostrarConta();

	public void guardarHistorico(Historico obj) {
		this.operacoes.add(obj);
	}
	
	public void mostrarOperacoes() {
		System.out.println("Histórico de operações");
		for (int i = 0; i < this.operacoes.size(); i++) {
			this.operacoes.get(i).mostrarHistorico();
		}
	}	
	
//	getters e setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public ArrayList<Historico> getOperacoes() {
		return operacoes;
	}

	public void setOperacoes(ArrayList<Historico> operacoes) {
		this.operacoes = operacoes;
	}
	
}
