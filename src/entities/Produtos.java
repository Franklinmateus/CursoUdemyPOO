package entities;

public class Produtos {
	
	private String nome;
	private double preco;
	private int qtd;
	
	//Construtor_Padrão
	public Produtos() {
		
	}
	
	//Construtor_Personalizado
	public Produtos(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	//Construtor_da_Sobrecarga_
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	//Métodos_Get_e_Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}


	//Métodos_da_classe
	public double valorTotalEstoque() {
		return preco * qtd;
	}
	
	public void addProdutoEstoque(int qtd) {
		this.qtd += qtd;
	}
	
	public void removeProdutoEstoque(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+ qtd
			+" Unidades, Total: $ "
			+ String.format("%.2f", valorTotalEstoque());
	}
	
	
}
