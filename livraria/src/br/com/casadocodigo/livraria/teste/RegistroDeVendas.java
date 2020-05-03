package br.com.casadocodigo.livraria.teste;

import java.util.List;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test Driven Development");
        ebook.setValor(29.90);

        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora é: " + fisico.getValor());
        }
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total: " + carrinho.getTotal());

        List<Produto> produtos = carrinho.getProdutos();

        for(Produto produto : produtos) {
            try {
                if (produto != null) {
                    System.out.println("Total: " + produto.getValor());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("A verificação ultrapassou o tamanho total do Array.");
            } catch (NullPointerException e) {
                System.out.println("Array não foi instanciado!");
            }
        }

        System.out.println("Fui executado!");

    }
}