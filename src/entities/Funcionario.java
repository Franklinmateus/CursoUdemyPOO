package entities;

public class Funcionario {

	private Integer ID;
	private String nome;
	private Double salario;
	
	//Constructor 
	public Funcionario(Integer iD, String nome, Double salario) {
		ID = iD;
		this.nome = nome;
		this.salario = salario;
	}


	//GetandSet
	public int getID() {
		return ID;
	}


	public void setID(Integer iD) {
		ID = iD;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}
	
	public void aumentoSalario(double porcentagem) {
		salario += salario * porcentagem / 100;
	}
	
	public String toString() {
		return ID + ", " + nome + ", " + salario;
	}
	
}
