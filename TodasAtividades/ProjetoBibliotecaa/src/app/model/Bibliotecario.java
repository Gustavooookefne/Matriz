package app.model;

public class Bibliotecario extends Pessoa {
	
	protected String turno;
	
	public Bibliotecario(String nome, int cpf, String turno) {
		super (nome, cpf);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void MostrarDados() {
		System.out.println("O seu turno é: "+turno);
	}

}
