package com.frutariaapp.view;

import java.util.Scanner;
import com.frutariaapp.model.Fruta;
import com.frutariaapp.model.Verdura;

public class Atendente {

    private Scanner sc;

    public Atendente() {
        sc = new Scanner(System.in);
    }
    			
    public int menuPrincipal() {
        System.out.println("|=============================|");
        System.out.println("|          Frutaria           |");
        System.out.println("|=============================|");
        System.out.println("|                             |");
        System.out.println("|1- Cadastrar Fruta           |");
        System.out.println("|2- Cadastrar Verduras        |");
        System.out.println("|3- Listar Frutas             |");
        System.out.println("|4- Listar Verduras           |");
        System.out.println("|5- Remover Frutas            |");
        System.out.println("|6- Remover Verduras          |");
        System.out.println("|                             |");
        System.out.println("|=============================|");
        System.out.println("|0- Sair                      |");
        System.out.println("|_____________________________|");

        int opcao = sc.nextInt();
        sc.nextLine(); 

        return opcao;
    }

    
    //-- CADASTRO DE FRUTAS --
    
    public String cadastrarNome() {
        System.out.println("\n<--Cadastrar Frutas-->\n");
        System.out.println("Nome: ");
        String nome = sc.nextLine();  
        return nome;
    }

    public double cadastrarPreco() {
        System.out.println("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine();  
        return preco;
    }

    public int cadastrarQuantidade() {
        System.out.println("Quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine(); 
        return quantidade;
    }

    public void listar(Fruta fruta) {
        System.out.println("----------------------");
        System.out.println("Nome: " + fruta.getNome());
        System.out.println("Preço: R$" + fruta.getPreco());
        System.out.println("Quantidade: " + fruta.getQuantidade());
    }

    
    //-- CADASTRO DE VERDURAS -- 
    public String CadastrarNomeVerdura() {
    	System.out.println("\n <--Cadastrar Verduras-->\n");
    	System.out.println("Nome:");
    	String nomeVerdura = sc.next();
    	return nomeVerdura;
    }
    public double cadastrarPrecoVerdura() {
        System.out.println("Preço: ");
        double precoVerdura = sc.nextDouble();
        sc.nextLine();  
        return precoVerdura;
    }

    public int cadastrarQuantidadeVerdura() {
        System.out.println("Quantidade: ");
        int quantidadeVerdura = sc.nextInt();
        sc.nextLine(); 
        return quantidadeVerdura;
    }
    
    public void ListarVerdura(Verdura verdura) {
        System.out.println("----------------------");
        System.out.println("Nome: " + verdura.getNome());
        System.out.println("Preço: R$" + verdura.getPreco());
        System.out.println("Quantidade: " + verdura.getQuantidade());
    }

    

    public String removerFruta() {
        System.out.println("Digite o nome da fruta a remover:");
        return sc.nextLine();
    }


    public void vizualizarFrutaRemovida(String nome) {
        System.out.println("A fruta '" + nome + "' foi removida.");
    }


    public void mensagemNaoEncontrado() {
        System.out.println("Fruta não encontrada.");
    }


    public void finalizarApp() {
        System.out.println("Sistema encerrado.");
    }


    public Scanner getInput() {
        return sc;
    }

    public void setInput(Scanner input) {
        this.sc = input;
    }
}