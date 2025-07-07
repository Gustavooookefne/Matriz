package app.modelEscola;

public class pessoa {
	protected String nome;
	protected String email;
	
	public  pessoa (String nome , String email) {
		this.email = email;
		this.nome = nome;
	}

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
	
	public void mostrarDados() {
		System.out.println("Nome: "+nome);
		System.out.println("Email: "+email);
	}
	
}

