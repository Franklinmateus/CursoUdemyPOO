package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produtos;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Insira informações do Produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		Produtos produto = new Produtos(nome, preco);
		
		produto.setNome("PC");
		System.out.println("Nome atualizado: " + produto.getNome());
		produto.setPreco(1200.00);
		System.out.println("Preço atualizado: " + produto.getPreco());
		
		System.out.println();
		System.out.println("Informações do Produto: " + produto);
		
		System.out.println();
		System.out.print("Entre com o números de produtos para adicionar ao estoque: ");
		int qtd = sc.nextInt();
		produto.addProdutoEstoque(qtd);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.print("Entre com o números de produtos para ser removido do estoque: ");
		qtd = sc.nextInt();
		produto.removeProdutoEstoque(qtd);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		
		
		sc.close();
	}

}
