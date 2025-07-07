package app.service;

import java.util.Scanner;

import app.model.Leitor;
import app.model.Bibliotecario;

public class CadastroService {

	private Scanner sc;
	
	public CadastroService() {
		this.sc = new Scanner(System.in);
	}
	
	public Leitor CadastrarLeitor() {
		System.out.println("Coloque o nome do leitor: : ");
		String nome = sc.next();
		
		System.out.println("Coloque o  cpf do leitor: ");
		int cpf = sc.nextInt();
		
		System.out.println("Coloque a matricula do leitor: ");
		int matricula = sc.nextInt();
		
		return new Leitor (nome ,cpf ,matricula);
	}
	
	public Bibliotecario CadastroBibliotecario() {
		
		System.out.println("Coloque o Seu nome: ");
		String nome = sc.next();
		
		System.out.println("Coloque o seu cpf: ");
		int cpf = sc.nextInt();
		
		System.out.println("Coloque o seu turno: ");
		String turno = sc.next();
		
		return new Bibliotecario (nome ,cpf ,turno);
	}
}
