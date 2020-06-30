package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ProgramAula80 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Insira informações da conta: ");
		System.out.print("Número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Nome do usuário da conta: ");
		String nome = sc.next();
		System.out.print("Deseja inserir um deposito inicial (s/n)? ");
		char confirmacao =sc.next().charAt(0);
		
		if(confirmacao == 's') {
			System.out.print("Qual o valor do deposito inicial? ");
			double valorDepInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nome, valorDepInicial);
			conta.depositarDinheiro(valorDepInicial);
		}else {
			conta = new Conta(numeroConta, nome);
		}
		
		System.out.println("Informações da conta: ");
		System.out.print(conta);
		System.out.println();
		
		System.out.println();
		System.out.print("Insira um valor para deposito: ");
		double valorDep = sc.nextDouble();
		conta.depositarDinheiro(valorDep);
		
		System.out.println("Informações da conta atualizada: ");
		System.out.print(conta);
		System.out.println();
		
		System.out.println();
		System.out.print("Insira um valor para saque: ");
		double valorSaq = sc.nextDouble();
		conta.sacarDinheiro(valorSaq);
		
		System.out.println("Informações da conta atualizada: ");
		System.out.print(conta);
		System.out.println();
		
		sc.close();
	}

}
