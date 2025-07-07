package com.frutariaapp.service;

import java.util.List;
import java.util.ArrayList;
import com.frutariaapp.model.Fruta;
import com.frutariaapp.view.Atendente;

public class Estoque {

    List<Fruta> listaFruta;

    public Estoque() {
        listaFruta = new ArrayList<>();
    }

    public void gerenciarEstoque(int opcao, Atendente atendente) {

        switch (opcao) {

            case 1 -> {
                String nome = atendente.cadastrarNome();
                double preco = atendente.cadastrarPreco();
                int quantidade = atendente.cadastrarQuantidade();

                Fruta fruta = new Fruta(nome, preco, quantidade);
                listaFruta.add(fruta);
                System.out.println("Fruta cadastrada: " + fruta.getNome());
            }

            case 2 -> {
                if (listaFruta.isEmpty()) {
                    System.out.println("Nenhuma fruta cadastrada.");
                } else {
                    for (Fruta fruta : listaFruta) {
                        atendente.listar(fruta);  
                    }
                }
            }

            case 3 -> {
                String nome = atendente.removerFruta();
                boolean removido = false;

                for (int indice = 0; indice < listaFruta.size(); indice++) {
                    if (listaFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
                        listaFruta.remove(indice);
                        removido = true;
                        break;
                    }
                }

                if (removido) {
                    atendente.vizualizarFrutaRemovida(nome);
                } else {
                    atendente.mensagemNaoEncontrado();
                }
            }

            case 0 -> {
                break;
            }

            default -> {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public List<Fruta> getEstoqueFruta() {
        return listaFruta;
    }

    public void setEstoqueFruta(List<Fruta> estoqueFruta) {
        this.listaFruta = estoqueFruta;
    }
}