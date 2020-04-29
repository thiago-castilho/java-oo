package br.com.casadocodigo.livraria;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produto =  new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produto[contador] = produto;
        contador++;
        this.total += produto.getValor();
    }

    public double getTotal() {
        return this.total;
    }

    public Produto[] getProdutos() {
        return this.produto;
    }


}
