package fag.objetos;

public class Pessoa {
	//attributes
	private String nome;
	private double peso, altura, IMC;
	
	//builder
	public Pessoa(String nome, double peso, double altura) {
		setNome(nome);
		setPeso(peso);
		setAltura(altura);
	}
	
	//setters
	public void setNome(String nome){
		if(nome != null && !nome.isBlank()) this.nome = nome;
	}
	public void setPeso(double peso) {
		if(peso > 0) this.peso = peso;
	}
	public void setAltura(double altura) {
		if(altura > 0) this.altura = altura;
	}
	
	//retorna o IMC
	public double calcularIMC() {
		return peso/Math.pow(altura,2);
	}
	
	//retorna classificação de peso
	public String classificacaoIMC() {
		double imc = peso/Math.pow(altura,2);
		if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
	}

}
