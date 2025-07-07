package app.model;

public class Veiculo {
	
	protected String placa;
	protected String marca;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Veiculo(String marca, String placa) {
		this.marca = marca;
		this.placa = placa;
	}
	
	public void MostrarDados() {
		System.out.println("Coloque a placa do veiculo: ");
		System.out.println("Coloque o modelo do veiculo: ");
	}
	
	

}
