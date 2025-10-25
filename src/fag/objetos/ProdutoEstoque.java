package fag.objetos;

public class ProdutoEstoque {
	//attributes
	private String nome;
	private int quantidade;
	
	//builder
	public ProdutoEstoque(String nome, int quantidade) {
		setNome(nome);
		setQuantidade(quantidade);
	}
	
	//setters
	public void setNome(String nome) {
		if(nome != null && !nome.isBlank()) this.nome = nome;
	}
	public void setQuantidade(int quantidade) {
		if(quantidade >= 0) this.quantidade = quantidade;
	}
	
	//getter
	public int getQuantidade() {
		return quantidade;
	}
	
	//adiciona estoque
	public void adicionarEstoque(int qtd) {
		if(qtd > 0) quantidade += qtd;
	}
	
	//remove estoque
	public void removerEstoque(int qtd) {
		if(qtd > 0 && qtd <= quantidade) quantidade -= qtd;
	}

}
