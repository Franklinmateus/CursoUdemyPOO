package application;

import java.util.Scanner;

import entities.Product;

public class vetorProdudos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vetor = new Product[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Product(nome, preco);
		}
		
		double soma = 0.0;
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma/n;
		
		System.out.println("A média de preço é: " + media);
		
		sc.close();
	}

}
