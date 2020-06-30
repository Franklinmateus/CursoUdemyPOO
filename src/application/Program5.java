package application;

import java.util.Scanner;

import entities.Aluno;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.println("Insira o nome do aluno: ");
		aluno.nome = sc.next();
		
		System.out.println();
		System.out.println("Insira as 3 notas do aluno: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("NOTA FINAL: " + aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println("PERDEU");
			System.out.println("Pontos faltando: " + aluno.pontosFaltando());
		}else {
			System.out.println("PASSOU!");
		}
		
		sc.close();
		
	}

}
