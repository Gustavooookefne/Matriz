package app.service;

import app.model.Leitor;
import app.model.Bibliotecario;
import app.service.CadastroService;

public class Main {

	public static void main(String[] args) {
		
		CadastroService cadastro = new CadastroService();

		Leitor leitor = cadastro.CadastrarLeitor();
		System.out.println("/Dados Leitor...");
		leitor.MostrarDados();
		
		Bibliotecario Cario = cadastro.CadastroBibliotecario();
		System.out.println("/Dados Bibliotecario...");
		Cario.MostrarDados();
	}

}
