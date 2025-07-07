package app.model;

public class Pessoa {

	protected String nome;
	protected int cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, int cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public void MostrarDados() {
		System.out.println("Coloque seu nome: ");
		System.out.println("Coloque seu Cpf: ");
	}
	
}
