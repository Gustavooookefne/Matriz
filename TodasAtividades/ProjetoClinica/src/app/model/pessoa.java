package app.model;

public class pessoa {

	protected String nome;
	protected int telefone;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public pessoa(String nome, int telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void mostrarDados() {
		System.out.print("Coloque o Nome :");
		System.out.print("Coloque o Telefone: ");
	}
	
	
}
