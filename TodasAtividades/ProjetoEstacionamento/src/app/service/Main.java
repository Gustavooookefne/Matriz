package app.service;

import app.model.Carro;
import app.model.Moto;
import app.service.CadastroService;

public class Main {

	public static void main(String[] args) {
		CadastroService cadastro = new CadastroService();
		
		Carro carro = cadastro.CadastrarCarro();
		System.out.println("/Dados carro...");
		carro.MostrarDados();
		
		Moto moto = cadastro.CadastrarMoto();
		System.out.println("?Dados Moto...");
		moto.MostrarDados();
	}

}
