package fag.objetos;

public class Musica {
	//attributes
	private String titulo;
	private int duracao;
	
	//builder
	public Musica(String titulo, int duracao) {
		setTitulo(titulo);
		setDuracao(duracao);
	}
	
	//setters
	public void setTitulo(String titulo) {
		if(titulo != null && !titulo.isBlank()) this.titulo = titulo;
	}
	public void setDuracao(int duracao) {
		if(duracao > 0) this.duracao = duracao;
	}
	
	//getters
	public String getTitulo() {
		return titulo;
	}
	
	//retorna tempo formatado
	public String formatarDuracao() {
		int minutos = duracao/60;
		int segundos = duracao%60;
		return String.format("%2d:%2d",minutos,segundos);
	}

}
