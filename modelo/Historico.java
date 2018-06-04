package modelo;

public class Historico {
    private String dataOp, codDestino;
    private double valor;
    
    public Historico(String data, String destino, double valor) {
    	this.setDataOp(data);
    	this.setCodDestino(destino);
    	this.setValor(valor);
    }
    
    public Historico(String data, double valor) {
    	this.setDataOp(data);
    	this.setValor(valor);
    }
    
    public Historico() {
    	
    }
    
//    funcionalidade
    
    public void mostrarHistorico() {
    	System.out.println("Data da operação: " + this.getDataOp());
    	if (this.getCodDestino() != null) {
    		System.out.println("Código de destino: " + this.getCodDestino());		
		}
    	System.out.println("Valor da operação: " + this.getValor());
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
