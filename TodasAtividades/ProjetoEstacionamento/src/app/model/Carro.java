package app.model;

public class Carro extends Veiculo {

	protected int numeroPorta;
	
	public Carro(String placa, String marca, int numeroPorta) {
		super(placa, marca);
		this.numeroPorta = numeroPorta;
		
	}

	public int getNumeroPorta() {
		return numeroPorta;
	}

	public void setNumeroPorta(int numeroPorta) {
		this.numeroPorta = numeroPorta;
	}
	
	@Override
	public void MostrarDados() {
		System.out.println("O numero de portas é: "+numeroPorta);
	}
}
