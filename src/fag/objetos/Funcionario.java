package fag.objetos;

public class Funcionario {
	//attributes
	private String nome;
	private double salario;
	
	//builder
	public Funcionario(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}
	
	//setters
	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) this.nome = nome;
	}
	public void setSalario(double salario) {
		if(salario >= 0) this.salario = salario;
	}
	public void aumentarSalario(double percentual){
		if(percentual >= 0) this.salario += salario*(percentual/100);
	}
	
	//exibe nome e salario na tela
	public void exibir() {
		System.out.printf("Funcionario: %s | Salario: R$ %.2f\n",nome,salario);
	}

}
