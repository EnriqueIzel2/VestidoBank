package modelo;

public class Cliente {
	private String cpf, endereco, nome, telefone, dataNascimento;
	private Conta contaPoupanca, contaCorrente;
	
	public Cliente(String nome, String endereco, String cpf, String data, String fone){
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(data);
		this.setEndereco(endereco);
		this.setTelefone(fone);
	}
	
//	funcionalidades
	public void mostrarDados(){
		
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