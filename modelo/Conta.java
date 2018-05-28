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
	}
	
	public Conta() {
		
	}
	
//	funcionalidades
	abstract public void creditar(double quantia);
	
	abstract public void debitar(double quantia);
	
	abstract public void efetuarTransferencia();
	
	abstract public void mostrarContas();
	
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
