package app.service;

import app.model.paciente;

import app.model.medico;
import app.service.CadastroService;

public class main {

	public static void main(String[] args) {
		CadastroService castra =  new CadastroService();
		
		paciente Paciente = castra.CadastrarPaciente();
		System.out.println("/Dados Paciente...");
		Paciente.mostrarDados();
		
		medico Medico = castra.CadastrarMedico();
		System.out.println("/Dados Medico...");
		Medico.mostrarDados();

	}

}
