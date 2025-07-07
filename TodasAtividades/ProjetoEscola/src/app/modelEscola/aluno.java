package app.modelEscola;

public class aluno extends pessoa {

	protected String serie;
	
	public aluno(String nome, String email, String serie) {
		super (nome , email);
		this.serie = serie;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	@Override
	public void mostrarDados () {
		System.out.println("Série: "+serie);
	}
}
