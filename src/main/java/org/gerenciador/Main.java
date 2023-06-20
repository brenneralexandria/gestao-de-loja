package org.gerenciador;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto produto1 = new Produto("Salgadinho", 12);
        Produto produto2 = new Produto("Refrigerante", 8);
        Produto produto3 = new Produto("Chocolate", 10);
        Produto produto4 = new Produto("Bala", 11);

        carrinho.addProduto(produto1);
        carrinho.addProduto(produto2);
        carrinho.addProduto(produto3);
        carrinho.addProduto(produto4);

        carrinho.exibirCarrinho();

        System.out.println(carrinho.calcularTotalCarrinho());

    }
}