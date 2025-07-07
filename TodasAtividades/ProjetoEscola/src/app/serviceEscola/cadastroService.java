package app.serviceEscola;

import app.modelEscola.aluno;
import app.modelEscola.professor;
import java.util.Scanner;

public class cadastroService {
	
	private Scanner sc;
	
	public cadastroService() {
		this.sc = new Scanner (System.in);
	}
	
	public aluno cadastrarAluno() { 
		System.out.println("Coloque o nome do aluno: ");
		String nome = sc.next();
		
		System.out.println("Coloque a email do aluno: ");
		String email = sc.next();
		
		System.out.println("Coloque a turma: ");
		String serie = sc.next();
	
	return new aluno (nome,email,serie);
	
	}
	
	public professor cadastroProfessor() {
		System.out.println("Coloque o nome do professor: ");
		String nome = sc.next();
		
		System.out.println("Coloque o email do professor");
		String email = sc.next();
		
		System.out.println("Coloque a diciplina que ele ira aplicar");
		String diciplina = sc.next();
		
		return new professor (nome,email,diciplina);
	}
}
