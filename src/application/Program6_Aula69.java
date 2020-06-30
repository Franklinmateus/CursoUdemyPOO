package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program6_Aula69 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);
		
		System.out.printf("A circunferência: %.2f%n", c);
		System.out.printf("A volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}
