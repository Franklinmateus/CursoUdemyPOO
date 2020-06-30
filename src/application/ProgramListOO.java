package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramListOO {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList<>();
		
		
		System.out.println("Quantos funcion�rios ser�o registrados: ");
		int numFun = sc.nextInt();
		
		for(int i=0; i<numFun; i++) {
			
			System.out.println("Funcion�rio #" + (i+1) + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("NOME: ");
			String nome = sc.next();
			System.out.print("SAL�RIO: ");
			Double salario  = sc.nextDouble();
			
			Funcionario func = new Funcionario(id, nome, salario);
			
			lista.add(func);
		}
		
		System.out.println("Entre com o ID do funcion�rio que tera o aumento: ");
		int idAumento = sc.nextInt();
		Integer pos = temId(lista, idAumento);
		if(pos == null) {
			System.out.println("Esse ID n�o existe!");
		}else {
			System.out.println("Qual a porcentagem do aumento:");
			double porcentagem = sc.nextDouble();
			lista.get(pos).aumentoSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcion�rios: ");
		for(Funcionario func : lista ) {
			System.out.println(func);
		}
		
		
		sc.close();

	}

	//Percorre a lista para descobrir a posi��o do id do funcion�rio
	public static Integer temId(List<Funcionario> lista, int id) {
		for(int i=0; i< lista.size(); i++) {
			if(lista.get(i).getID() == id) {
				return i;
			}
		}
		return null;
	}
	
}
