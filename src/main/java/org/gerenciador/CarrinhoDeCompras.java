package org.gerenciador;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removeProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotalCarrinho() {
        double precoTotal = 0.0;
        for (Produto produto : produtos) {
            precoTotal += produto.getPreco();
        }
        return precoTotal;
    }

    public void exibirCarrinho() {
        System.out.println("Carrinho de compras:");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }
    }
}