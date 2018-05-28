package modelo;

public class ContaCorrente extends Conta {
	private double valorManutencao;
	
	public ContaCorrente(String data, String codigo, double saldo) {
		super(data, codigo, saldo);
		this.setValorManutencao(32.69);
	}
	
	public ContaCorrente() {
		super();
	}
	
//	funcionalidades
	public void efetuarDescontoManutencao(){
		this.setSaldo(getSaldo() - this.getValorManutencao());
	}
	
	public void controlarDescontoManutencao() {
//		quanto foi descontado cada mẽs
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

//	funcionalidades abstratas
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
		System.out.println("Conta Corrente");
		System.out.println("Data de abertura: " + super.getDataAbertura());
		System.out.println("Código da conta: " + super.getCodigo());
		System.out.println("Saldo da conta: " + super.getSaldo());		
	}
}
