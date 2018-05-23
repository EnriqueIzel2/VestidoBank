package modelo;

public class ContaPoupanca extends Conta {
	private String aniversarioConta;
	private double porcJuros;
	
	public ContaPoupanca(Agencia agencia, String data, int codigo, double saldo, String niver, double juros) {
		super(agencia, data, codigo, saldo);
		this.setAniversarioConta(niver);
		this.setPorcJuros(juros);
	}
	
//	funcionalidades
	public void calcularJuros(){
		
	}
	
	public void mostrarDados() {
		System.out.println("Aniversário da conta: " + this.getAniversarioConta());
		System.out.println("Porcentagem de juros: " + this.getPorcJuros());
	}

//	getters e setters
	public String getAniversarioConta() {
		return aniversarioConta;
	}

	public void setAniversarioConta(String aniversarioConta) {
		this.aniversarioConta = aniversarioConta;
	}

	public double getPorcJuros() {
		return porcJuros;
	}

	public void setPorcJuros(double porcJuros) {
		this.porcJuros = porcJuros;
	}
}