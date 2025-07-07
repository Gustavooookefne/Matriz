package com.frutariaapp;

import com.frutariaapp.view.Atendente;
import com.frutariaapp.service.Estoque;

public class FrutariaApp {

    public static void main(String[] args) {
        
        int opcaoMenuEscolhida = 1;
        
        Atendente atendente = new Atendente();
        Estoque estoque = new Estoque(); 

        
        do {
            opcaoMenuEscolhida = atendente.menuPrincipal();
            estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente);
        } while (opcaoMenuEscolhida != 0);

        atendente.finalizarApp();
    }
}