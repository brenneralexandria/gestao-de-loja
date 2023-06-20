package org.gerenciador;

public class Pedido {

    private Produto produto;
    private int quantidade;
    private double precoTotal;
    private Cliente cliente;

    // Construtor
    public Pedido(Produto produto, int quantidade, double precoTotal, Cliente cliente) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;
        this.cliente = cliente;
    }

    // Getters e Setters
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}