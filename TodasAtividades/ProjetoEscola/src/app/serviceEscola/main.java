package app.serviceEscola;

import app.modelEscola.aluno;
import app.modelEscola.professor;
import app.serviceEscola.cadastroService;

public class main {

	public static void main(String[] args) {
		cadastroService cadastro = new cadastroService();
		
		aluno Aluno = cadastro.cadastrarAluno();
		System.out.println("/Dados Alunos: ");
		Aluno.mostrarDados();
		
		professor Professor = cadastro.cadastroProfessor();
		System.out.println("/Dados Professor: ");
		Professor.mostrarDados();
		

	}

}
