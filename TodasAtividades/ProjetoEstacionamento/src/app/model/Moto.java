package app.model;

public class Moto extends Veiculo {
	protected String cilindradas;
	
	public Moto(String placa, String marca, String cilindradas) {
		super(placa, marca);
		this.cilindradas = cilindradas;
	}

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public void MostrarDados() {
		System.out.println("A quantidade de Cilindradas é: "+cilindradas);
	}

}
