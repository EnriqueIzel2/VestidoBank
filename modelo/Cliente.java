package modelo;

public class Cliente {
	private String cpf, endereco, nome, telefone, dataNascimento;
	private ContaCorrente cntCorrente;
	private ContaPoupanca cntPoupanca;
	
	public Cliente(String nome, String endereco, String cpf, String data, String fone){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(data);
		this.setEndereco(endereco);
		this.setTelefone(fone);
	}
	
//	funcionalidades
	public void abrirContaCorrente(String data, Agencia agencia, int codigo, double saldo) {
		this.cntCorrente = new ContaCorrente(agencia, data, codigo, saldo);
	}
	
	public void abrirContaPoupanca() {
		
	}
	
	public void excluirContaCorrente() {
		
	}
	
	public void excluirContaPoupanca() {
		
	}
	
	public void mostrarDados(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cpf: " + this.getCpf());
		System.out.println("Data de nascimento: " + this.getDataNascimento());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
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
	
	
}