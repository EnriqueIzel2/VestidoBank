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
		super.setSaldo(getSaldo() + quantia);
		System.out.println("Quantia adicionado com sucesso");
	}

	@Override
	public void debitar(double quantia) {
		if (super.getSaldo() >= quantia) {
			super.setSaldo(getSaldo() - quantia);		
		}
		else {
			System.out.println("Seu saldo é menor que a quantia desejada");
		}
	}

	@Override
	public void efetuarTransferencia(double quantia, String destino) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mostrarConta() {
		System.out.println("Conta Poupança");
		System.out.println("Data de abertura: " + super.getDataAbertura());
		System.out.println("Código da conta: " + super.getCodigo());
		System.out.println("Saldo da conta: " + super.getSaldo());
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
