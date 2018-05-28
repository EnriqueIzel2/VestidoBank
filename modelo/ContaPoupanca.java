package modelo;

public class ContaPoupanca extends Conta {
	private String aniversarioConta;
	private double porcJuros;
	
	public ContaPoupanca(String data, String codigo, double saldo, String niver, double juros) {
		super(data, codigo, saldo);
		this.setAniversarioConta(niver);
		this.setPorcJuros(juros);
	}
	
	public ContaPoupanca() {
		super();
	}

//	funcionalidades
	@Override
	public void creditar(double quantia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debitar(double quantia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void efetuarTransferencia() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mostrarContas() {
		// TODO Auto-generated method stub

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
