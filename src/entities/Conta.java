package entities;

public class Conta {

	private int numeroConta;
	private String nome;
	private double saldo;
	
	
	//Construtor_
	public Conta(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}	
	
	public Conta(int numeroConta, String nome, double valorDepInicial) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		depositarDinheiro(valorDepInicial);
	}

	//Get_and_Set
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void getSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Metodos_da_classe
	public void depositarDinheiro(double valorDep) {
		this.saldo += valorDep;
	}
	
	public void sacarDinheiro(double valorSaq) {
		this.saldo = saldo - (valorSaq+5);
	}

	public String toString() {
		return "Conta: " + numeroConta
				+ ", Proprietário: " + nome
				+ ", Saldo: " + saldo;
	}
	
}
