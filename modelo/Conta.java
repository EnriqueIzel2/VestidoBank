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
	public void creditar(double quantia) {
		this.setSaldo(this.getSaldo() + quantia);
		System.out.println("Quantia adicionado com sucesso");
	}
	
	public void debitar(double quantia) {
		if (this.getSaldo() >= quantia) {
			this.setSaldo(getSaldo() - quantia);		
		}
		else {
			System.out.println("Seu saldo é menor que a quantia desejada");
		}
	}
	
	public void efetuarTransferencia(double quantia, String codDestino) {
		for (int i = 0; i < 2; i++) {
			if (codDestino == this.getCodigo()) {
			
			}
			else {
				System.out.println("Conta destino não existe");
			}
		}
	}
	
	public void mostrarContas() {
		
		System.out.println("Data abertura: " + this.getDataAbertura());
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Saldo: " + this.getSaldo());
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