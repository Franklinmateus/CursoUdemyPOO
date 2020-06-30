package application;

import java.util.Scanner;

import entities.Funcionario1;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Funcionario1 func;
		func = new Funcionario1();
		
		System.out.println("Insira o nome do funcionário: ");
		func.nome = sc.next();
		System.out.println("Insira o salário bruto do funcionário: ");
		func.salBruto = sc.nextDouble();
		System.out.println("Insira o valor do imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.print("Empregado "+ func);
		
		System.out.println();
		System.out.println("Qual a porcentagem de aumento? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.print("Dados atualizados: "+ func);
		
		sc.close();

	}

}
