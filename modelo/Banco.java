package modelo;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Agencia> agencias;
	
	public Banco(){
		this.agencias = new ArrayList<Agencia>();
	}
	
	public void cadastrarAgencia(Agencia obj){
		this.agencias.add(obj);
		System.out.println("Agência cadastrada com sucesso");
	}
	
	public void excluirAgencia(Agencia obj){
		this.agencias.remove(obj);
		System.out.println("Agência removida com sucesso");
	}
	
	public void editarAgencia(String procurado, Agencia nova){
		for (int i = 0; i < this.agencias.size(); i++) {
			if (this.agencias.get(i).equals(procurado)) {
				this.agencias.remove(procurado);
				this.agencias.add(nova);
				System.out.println("Agência editada com sucesso");
			}
			else {
				System.out.println("Agência não encontrada, verifique o número chamado ou consulte 102");
			}
		}
	}

	
//	getters e setters
	public ArrayList<Agencia> getAgencias() {
		return agencias;
	}

	public void setAgencias(ArrayList<Agencia> agencias) {
		this.agencias = agencias;
	}
}