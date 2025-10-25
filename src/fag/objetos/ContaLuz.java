package fag.objetos;

public class ContaLuz {
	//attributes
	private double consumoKwh, valorKwh;
	
	//builder
	public ContaLuz(double consumoKwh, double valorKwh) {
		setConsumoKwh(consumoKwh);
		setValorKwh(valorKwh);
	}
	
	//setters
	public void setConsumoKwh(double consumoKwh) {
		if(consumoKwh > 10) this.consumoKwh = consumoKwh;
	}
	public void setValorKwh(double valorKwh) {
		if(valorKwh > 0) this.valorKwh = valorKwh;
	}
	
	//retorna consumo
	public double calcularValorTotal() {
		return consumoKwh * valorKwh;
	}

}
