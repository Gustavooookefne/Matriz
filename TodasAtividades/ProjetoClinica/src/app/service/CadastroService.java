package app.service;

import app.model.paciente;
import java.util.Scanner;
import app.model.medico;


public class CadastroService {

	private Scanner sc;
	
	public CadastroService() {
		this.sc = new Scanner (System.in);
	}
	public paciente CadastrarPaciente() {
	System.out.println("Coloque o nome do paciente: ");
	String nome = sc.next();
	
	System.out.println("Coloque o telefone do paciente: ");
	int telefone = sc.nextInt();
	
	System.out.println("Coloque o plano de saude do paciente: ");
	String planodesaude = sc.next();
	
	return new paciente(nome,telefone,planodesaude); 
}

	public medico CadastrarMedico() {
	System.out.println("Coloque o nome do medico: ");
	String nome = sc.next();
	
	System.out.println("Coloque o telefone do medico");
	int telefone = sc.nextInt();
	
	System.out.println("Coloque a especialidade do medico: ");
	String especialidade = sc.next();
	
	return new medico (nome,telefone,especialidade);
	
}
	
}
