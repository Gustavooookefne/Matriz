package app.modelEscola;

public class professor extends pessoa {

	protected String diciplina;
	
	public professor (String nome , String email , String diciplina) {
		super (nome , email);
		this.diciplina = diciplina;
	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Diciplina: "+diciplina);
	}
	
}
