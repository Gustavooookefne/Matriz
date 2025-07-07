package app.model;

public class Leitor extends Pessoa {

	protected int matricula;
	
	public Leitor(String nome, int matricula, int cpf) {
		super(nome,cpf);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void MostrarDados() {
		System.out.println("Aqui esta sua patricula: "+matricula);
	}
	
}
