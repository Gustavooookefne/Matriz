package com.frutariaapp.model;

public class Produto {

    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto() {
        this.nome = "";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void dados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}