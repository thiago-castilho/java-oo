package br.com.casadocodigo.livraria;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.total += produto.getValor();
    }

    public double getTotal() {
        return this.total;
    }
}
