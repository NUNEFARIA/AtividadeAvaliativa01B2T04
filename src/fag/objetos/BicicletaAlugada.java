package fag.objetos;

public class BicicletaAlugada {
	//attributes
	private int horas;
	private double valorHora;
	
	//builder
	public BicicletaAlugada(int horas, double valorHora) {
		setHoras(horas);
		setValorHora(valorHora);
	}
	
	//setters
	public void setHoras(int horas) {
		if(horas >= 1) this.horas = horas;
	}
	public void setValorHora(double valorHora) {
		if(valorHora > 0) this.valorHora = valorHora;
	}
	
	//retorna o valor do aluguel
	public double calcularValor() {
		return horas * valorHora;
	}

}
