package fag.objetos;

public class Filme {
	//attributes
	private String titulo;
	private double avaliacao;
	
	//builder
	public Filme(String titulo, double avaliacao) {
		setTitilo(titulo);
		setAvaliacao(avaliacao);
	}
	
	//setters
	public void setTitilo(String titulo) {
		if(titulo != null && !titulo.isBlank()) this.titulo = titulo;
	}
	public void setAvaliacao(double avaliacao) {
		if(avaliacao >= 0.0 && avaliacao <= 5) this.avaliacao = avaliacao;
	}
	
	public void exibir() {
		System.out.println("Filme: " + titulo + " | Avaliação: "+ avaliacao + " ⭐");
	}

}
