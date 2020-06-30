package application;

import java.util.Scanner;

import entities.Aluguel;

public class ProgramAluguel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluguel[] vetor = new Aluguel[10];
		
		System.out.println("Informe o numero de estudantes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Aluguel #"+i);
			System.out.print("Insira o nome: ");
			String nome = sc.nextLine();
			System.out.print("Insira o Email: ");
			String email = sc.nextLine();
			System.out.print("Insira o nº do quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println();
		System.out.println("Informações dos alugueis: ");
		
		for(int i=0; i<10; i++) {
			if(vetor[i] != null) {
				System.out.print(i +": "+ vetor[i]);
			}
		}
		
		
		
		
		sc.close();
	}

}
