package application;

import java.util.Scanner;
import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		
		System.out.println("Entre com os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		
		System.out.printf("햞ea do triangulo X: %.4f%n", areaX);
		System.out.printf("햞ea do triangulo Y: %.4f%n", areaY);
		
		
		if(areaX > areaY) {
			System.out.println("햞ea maior: X");
		}else {
			System.out.println("햞ea maior: Y");
		}
		
		sc.close();
		
	}

}
