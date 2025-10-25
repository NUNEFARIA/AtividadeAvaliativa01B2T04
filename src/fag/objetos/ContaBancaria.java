package fag.objetos;

public class ContaBancaria {
	//attributes
	private String titular;
    private double saldo;

    //builder
    public ContaBancaria(String titular) {
        setTitular(titular);
        this.saldo = 0.0;
    }
    
    //getters
    public String getTitular() { return titular; }
    public void setTitular(String titular) {
        if (titular != null && !titular.isBlank()) 
        this.titular = titular;
    }
    public double getSaldo() { 
    	return saldo; 
    }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) { 
        	saldo -= valor; 
        	return true; 
        	}
        return false;
    }
}
