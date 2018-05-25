package modelo;

public class Historico {
    private String dataOp, codDestino;
    private double valor;
    
    public Historico() {
    	
    }
    
//    funcionalidades
    public void efetuarTransferencia() {
    	
    }
    
    public void armazenarOperacao() {
    	
    }
    
//getters e setters
	public String getDataOp() {
		return dataOp;
	}

	public void setDataOp(String dataOp) {
		this.dataOp = dataOp;
	}

	public String getCodDestino() {
		return codDestino;
	}

	public void setCodDestino(String codDestino) {
		this.codDestino = codDestino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
