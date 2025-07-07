package app.model;

public class paciente extends pessoa {
	
	protected String planoSaude;
	
	public paciente (String nome, int telefone, String planoSaude) {
		super(nome, telefone);
		this.planoSaude = planoSaude;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	@Override
	public void mostrarDados() {
		System.out.println("Seu plano de saude é: "+planoSaude);
	}
	

	
	
}
