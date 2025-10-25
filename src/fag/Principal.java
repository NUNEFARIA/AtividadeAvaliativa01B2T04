package fag;

import fag.objetos.ContaBancaria;
import fag.objetos.Filme;
import fag.objetos.Funcionario;
import fag.objetos.Retangulo;
import fag.objetos.Musica;
import fag.objetos.Pessoa;
import fag.objetos.ContaLuz;
import fag.objetos.BicicletaAlugada;
import fag.objetos.ProdutoEstoque;
import fag.objetos.Temperatura;

public class Principal {

	public static void main(String[] args) {
		//cada metodo abaixo testa uma das classes
		
		//1
		testaContaBancaria();
		
		//2
    	testaFilme();
		
		//3
		testaFuncionario();
		
		//4
    	testaRetangulo();
		
		//5
		testaMusica();
		
		//6
		testaPessoa();
		
		//7
		testaContaDeLuz();
		
		//8
		testeAluguelDeBicicleta();
		
		//9
		testaProdutoEstocado();
		
		//10
		testaTemperatura();
		
	}
	
	//1. Conta Bancária
	public static void testaContaBancaria() {
		System.out.printf("\n\n\n1. Conta Bancária\n\n");
		
		//cria a para gustavo
		ContaBancaria conta = new ContaBancaria("Gustavo");
		
		// saques e depósitos
		conta.depositar(100);
		System.out.printf("Depositou 100. Saldo: R$ %.2f%n", conta.getSaldo());
		conta.sacar(50);
		System.out.printf("Sacou 50. Saldo: R$ %.2f%n", conta.getSaldo());
		conta.depositar(100);
		System.out.printf("Depositou 100. Saldo: R$ %.2f%n", conta.getSaldo());
		conta.sacar(50);
		System.out.printf("Sacou 50. Saldo: R$ %.2f%n", conta.getSaldo());

		// mostra o resultado final
		double saldoFinal = conta.getSaldo();
		System.out.printf("\nSaldo final: R$ %.2f%n", saldoFinal);
	}
	
	//2. Filme (avaliação)
    public static void testaFilme() {
    	System.out.printf("\n\n\n2. Filme (avaliação)\n\n");
    	
    	//cria filmes
    	Filme velosesFuriososToquio = new Filme("Veloses e Furiosos Desafio em Toquio",5.0);
    	Filme titanic = new Filme("Titanic", 3.5);
    	
    	//exibe filmes
    	velosesFuriososToquio.exibir();
    	titanic.exibir();
	}
    
    //3. Funcionario (salário)
    public static void testaFuncionario() {
    	System.out.printf("\n\n\n3. Funcionario (salário)\n\n");
    	
    	//cria funcionario
    	Funcionario gustavo = new Funcionario("Gustavo",10000);
    	
    	//mostra o salario anates do almento
    	gustavo.exibir();
    	
    	//aumenta o salario
    	gustavo.aumentarSalario(10);
    	
    	//mostra o salario depois do almento
    	gustavo.exibir();
	}

    //4. Retângulo (área e perímetro)
	public static void testaRetangulo() {
		System.out.printf("\n\n\n4. Retângulo (área e perímetro)\n\n");
		
		//cria retangulo
		Retangulo retanguloX = new Retangulo(8.0,4.0);
		
		//mostra área e perímetro
		double areaX = retanguloX.area();
		double perimetroX = retanguloX.perimetro();
		System.out.printf("Área: %.2f \nPerímetro: %.2f", areaX, perimetroX);
	}
	
	//5. Música (duração)
    public static void testaMusica() {
    	System.out.printf("\n\n\n5. Música (duração)\n\n");
    	
    	//cria músicas
    	Musica burguesinha = new Musica("Burguesinha",258);
    	Musica beatIt = new Musica("Beat It",165);
    	
    	//imprime título e duração
    	String tituloBurguesinha = burguesinha.getTitulo();
    	String duracaoBurgusinha = burguesinha.formatarDuracao();
    	String tituloBeatIt = beatIt.getTitulo();
    	String duracaoBeatIt = beatIt.formatarDuracao();
    	System.out.printf("Título: %s | Duração %s\n",tituloBurguesinha,duracaoBurgusinha);
    	System.out.printf("Título: %s | Duração %s\n",tituloBeatIt,duracaoBeatIt);
;	}
    
    //6. Pessoa (IMC)
    public static void testaPessoa() {
    	System.out.printf("\n\n\n6. Pessoa (IMC)\n\n");
    	
    	//cria uma pessoa
    	Pessoa gustavo = new Pessoa("Gustavo", 84, 1.84);
    	
    	//exibe IMC e a classificação
    	double imcGustavo = gustavo.calcularIMC();
    	String classGustavo = gustavo.classificacaoIMC();
    	System.out.printf("IMC: %.0f \nClassificação: %s", imcGustavo, classGustavo);
	}	
    
    //7. Conta de Luz
    public static void testaContaDeLuz() {
    	System.out.printf("\n\n\n7. Conta de Luz\n\n");
    	
    	//cria uma conta
    	ContaLuz outubro = new ContaLuz(152,1);
    	
    	//exibe valor a pagar
    	System.out.printf("Valor a ser pago: R$ %.2f", outubro.calcularValorTotal());
	}
	
    //8. Aluguel de Bicicleta
    public static void testeAluguelDeBicicleta() {
    	System.out.printf("\n\n\n8. Aluguel de Bicicleta\n\n");
    	
    	//cria novo aluguel
    	BicicletaAlugada novoAluguel = new BicicletaAlugada(8,5.50);
    	
    	//exibe o valor final
    	System.out.printf("Valor final: R$ %.2f", novoAluguel.calcularValor());
	}
    
    //9. Produto Estocado
    public static void testaProdutoEstocado() {
    	System.out.printf("\n\n\n9. Produto Estocado\n\n");
    	
    	//cria um produto
    	ProdutoEstoque prato = new ProdutoEstoque("prato", 300);
    	
    	//adiciona e remove estoque
    	prato.adicionarEstoque(200);
    	prato.removerEstoque(100);
    	
    	//exibe quantidade final
    	System.out.println("Quantidade final: " + prato.getQuantidade());
	}
    
    //10. Temperatura (Conversão)
    public static void testaTemperatura() {
    	System.out.printf("\n\n\n10. Temperatura (Conversão)\n\n");
    	
    	//cria uma temperatura
    	Temperatura sabado = new Temperatura(27);
    	
    	//exibe as converções
    	double sabadoF = sabado.paraFahrenheit();
    	double sabadoK = sabado.paraKelvin();
    	System.out.printf("Em Fahrenheit: %.0fºF\nEm Kelvin: %.0fºK", sabadoF, sabadoK);
    	
    	}
}
