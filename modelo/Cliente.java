package modelo;

public class Cliente {
	private String cpf, endereco, nome, telefone, dataNascimento;
	private Conta contas[] = new Conta[2];
	
	public Cliente(String nome, String endereco, String cpf, String data, String fone){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(data);
		this.setEndereco(endereco);
		this.setTelefone(fone);
	}
	
//	funcionalidades
	public void abrirContaCorrente(Agencia agencia, String data, String codigo, double saldo) {
		if (!(this.contas[0] instanceof ContaCorrente)) {
			this.contas[0] = new ContaCorrente(data, codigo, saldo);
			 System.out.println("Conta Corrente aberta com sucesso");
		}
		else {
			System.out.println("Esse cliente já possui uma conta corrente");
		}
	}
	
	public void abrirContaPoupanca(Agencia agencia, String data, String codigo, double saldo, String niver, double juros) {
		if (!(this.contas[1] instanceof ContaPoupanca)) {
			this.contas[0] = new ContaPoupanca(data, codigo, saldo, niver, juros);
			 System.out.println("Conta Poupança aberta com sucesso");
		}
		else {
			System.out.println("Esse cliente já possui uma conta poupança");
		}
	}
	
	public void fecharContaCorrente() {
		this.contas[0] = null;
		System.out.println("Conta Corrente excluída com sucesso");
	}
	
	public void fecharContaPoupanca() {
		this.contas[1] = null;
		System.out.println("Conta Poupança excluída com sucesso");
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Data de nascimento: " + this.getDataNascimento());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		this.contas[0].mostrarContas();
	}
	
//	setters e getters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	
}