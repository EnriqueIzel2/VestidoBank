package modelo;

public abstract class Conta {
	private int codigo;
	private double saldo;
	private String dataAbertura;
	private Agencia agencia;
	
	public Conta(Agencia agencia, String data, int codigo, double saldo) {
		this.setAgencia(agencia);
		this.setDataAbertura(data);
		this.setCodigo(codigo);
		this.setSaldo(saldo);
	}
	
	public Conta() {
		
	}
	
	public void mostrarContas() {
		
	}
	
//	getters e setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
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
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
}