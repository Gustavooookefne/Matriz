package app.model;

public class medico extends pessoa {

	protected String especialidade;
	
	public medico(String nome, int telefone, String especialidade) {
		super(nome, telefone);
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("A especialidade é :"+especialidade);
	}
	
}
