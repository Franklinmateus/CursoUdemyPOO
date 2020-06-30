package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorMoeda;

public class Program7Conversor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insita o valor do dolar: ");
		double valorD = sc.nextDouble();
		
		System.out.println("Insira quantos dolar quer comprar: ");
		double dolarQtd = sc.nextDouble();
		
		double real = ConversorMoeda.conversor(valorD, dolarQtd);
		
		System.out.println("O valor em REAL é: " + real);
		
		sc.close();
	}

}
