package entities;

public class Aluguel {

	private String nome;
	private String email;
	
	//Constructor
	public Aluguel(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	//Get and Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		return nome + ", " + email;
	}
	
}
