package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo;
		retangulo = new Retangulo();
		
		System.out.println("Entre com a altura e largura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.base = sc.nextDouble();
		
		System.out.printf("A área do retangulo é: %.2f%n", retangulo.area());
		System.out.printf("O perimetro do retangulo é: %.2f%n", retangulo.perimetro());
		System.out.printf("A diagonal do retangulo é: %.2f%n",retangulo.diagonal());
			
		sc.close();
		
	}

}
