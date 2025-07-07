package app.service;

import app.model.Carro;
import java.util.Scanner;
import app.model.Moto;

public class CadastroService {

	private Scanner sc;
	
	public CadastroService() {
		this.sc = new Scanner (System.in);
		
	}
	
	public Carro CadastrarCarro() {
		System.out.println("Coloque A Placa do Veiculo: ");
		String placa = sc.next();
		
		System.out.println("Coloque o modelo do Veiculo: ");
		String modelo = sc.next();
		
		System.out.println("Coloque a quantidade de Portas do veiculo: ");
		int numeroPorta = sc.nextInt();
		
		return new Carro (placa, modelo, numeroPorta);
	}
	
	public Moto CadastrarMoto() {
		System.out.println("Coloque A Placa do Veiculo: ");
		String placa = sc.next();
		
		System.out.println("Coloque o modelo do Veiculo: ");
		String modelo = sc.next();
		
		System.out.println("Coloque a quantidade de cilindradas tem: ");
		String cilindradas = sc.next();
		
		return new Moto (placa, modelo, cilindradas);
	}
}


