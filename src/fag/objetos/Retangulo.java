package fag.objetos;

public class Retangulo {
	//attributes
	private double largura;
	private double altura;
	
	//builder
	public Retangulo(double largura, double altura) {
		setLargura(largura);
		setAltura(altura);
	}
	
	//setters
	public void setLargura(double largura) {
		if(largura > 0.0) this.largura = largura; 
	}
	public void setAltura(double altura) {
		if(altura > 0.0) this.altura = altura;
	}
	
	//retorna a area
	public double area() {
		return largura*altura;
	}
	
	//retorna o perimetro
	public double perimetro() {
		return 2*(largura+altura);
	}
}
