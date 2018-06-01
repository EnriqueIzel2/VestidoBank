package modelo;

public class ContaCorrente extends Conta {
	private double valorManutencao;
	Historico obj;
	
	public ContaCorrente(String data, String codigo, double saldo) {
		super(data, codigo, saldo);
		this.setValorManutencao(0.3);
	}
	
	public ContaCorrente() {
		super();
	}
	
//	funcionalidades
	public void efetuarDescontoManutencao(){
		super.setSaldo(getSaldo() - (super.getSaldo() * this.getValorManutencao() / 100));
	}
	
	public void controlarDescontoManutencao() {
		System.out.println("Foi descontado: " + super.getSaldo() * this.getValorManutencao() / 100);
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
		super.guardarHistorico(obj = new Historico("31", quantia));
	}

	@Override
	public void debitar(double quantia) {
		if (super.getSaldo() >= quantia) {
			super.setSaldo(getSaldo() - quantia);
			super.guardarHistorico(obj = new Historico("31", quantia));
		}
		else {
			System.out.println("Seu saldo é menor que a quantia desejada");
		}
	}

	@Override
	public void efetuarTransferencia(double quantia, String destino) {
		this.debitar(quantia);
		System.out.println("Transferência realizada");
		System.out.println("Novo saldo: " + super.getSaldo());
		super.guardarHistorico(obj = new Historico("31", destino, quantia));
	}

	@Override
	public void mostrarConta() {
		System.out.println("Conta Corrente");
		System.out.println("Data de abertura: " + super.getDataAbertura());
		System.out.println("Código da conta: " + super.getCodigo());
		System.out.println("Saldo da conta: " + super.getSaldo());		
	}
}
