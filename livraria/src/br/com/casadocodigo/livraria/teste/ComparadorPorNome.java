package br.com.casadocodigo.livraria.teste;

import java.util.Comparator;

import br.com.casadocodigo.livraria.produtos.Livro;

public class ComparadorPorNome implements Comparator<Livro>{

    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
    
}