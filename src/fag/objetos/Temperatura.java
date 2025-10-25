package fag.objetos;

public class Temperatura {
	//attributes
	private double celsius;
	
	//builder
	public Temperatura(double celsius) {
		setCelsius(celsius);
	}
	
	//setter
	public void setCelsius(double celsius) {
		if(celsius >= -273.15) this.celsius = celsius;
	}
	
	//converte pera Fahrenheit
	public double paraFahrenheit() {
		return (celsius * 9/5) + 32;
	}
	
	//converte para Kelvin
	public double paraKelvin() {
		return celsius + 273.15;
	}

}
