package entities;

public class Funcionario1 {

	public String nome;
	public double salBruto;
	public double imposto;
	
	
	public double salarioLiquido() {
		return salBruto - imposto;
	}
	
	public void aumentoSalario(double porcentagem) {
		salBruto += salBruto * porcentagem / 100;
	}
	
	public String toString() {
		return nome + ", $ " + salarioLiquido();
	}
}
