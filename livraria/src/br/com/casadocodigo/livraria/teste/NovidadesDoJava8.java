package br.com.casadocodigo.livraria.teste;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O. O.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livro> livros = Arrays.asList(javaoo, java8, ruby);

        // Método 1
        Collections.sort(livros, new ComparadorPorNome());

        // Método 2 - Conhecido como classe anônima
        Collections.sort(livros, new Comparator<Livro>() {

            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getNome().compareTo(l2.getNome());
            }

        });

        // Método 3
        livros.sort(new Comparator<Livro>() {
            @Override
            public int compare(Livro l1, Livro l2) {
                return l1.getNome().compareTo(l2.getNome());
            }
        });

        // Método 4 - Lambda
        livros.sort((Livro l1, Livro l2) -> {
            return l1.getNome().compareTo(l2.getNome());
        });

        // Simplificando o método 4
        livros.sort((l1, l2) -> l1.getNome().compareTo(l2.getNome()));

        // Simplificando um pouco mais o método 4
        livros.sort(Comparator.comparing(l -> l.getNome()));

        // Simplificando mais ainda o método 4
        livros.sort(comparing(l -> l.getNome()));
        
        // Simplificando o método 4 com method reference
        livros.sort(comparing(Livro::getNome));

        // for(Livro livro : livros){
        //     System.out.println(livro.getNome());
        // }

        // livros.forEach(l -> System.out.println(l.getNome()));


        // FILTRANDO NO JAVA ANTIGO
        List<Livro> filtrados = new ArrayList<>();
        for(Livro livro : livros){
            if(livro.getNome().contains("Java")) {
                filtrados.add(livro);
            }
        }

        // for(Livro livro : filtrados) {
        //     System.out.println(livro.getNome());
        // }
        

        // FILTRANDO NO JAVA 8 COM STREAM
        livros.stream().filter(l -> l.getNome().contains("Java"));

        for(Livro livro : livros) {
            System.out.println(livro.getNome());
        }
    }
}