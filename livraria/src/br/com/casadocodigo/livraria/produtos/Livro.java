package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

import br.com.casadocodigo.livraria.exception.AutorNuloException;
public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        this();
        if(autor == null) {
            throw new AutorNuloException("O Autor do livro não pode ser nulo.");
        }
        this.autor = autor;
    }
    
    public Livro() {
        this.isbn = "000-00-00000-00-0";
    }

    @Override
    public String toString() {
        return "Nome: " + nome 
        + "\nDescrição: " + descricao
        + "\nValor: " + valor 
        + "\nISBN: " + isbn;
    }

    @Override
    public int compareTo(Produto outro) {

        return (int) (this.getValor() - outro.getValor());

        // Forma verbosa: 
        
        // if (this.getValor() < outro.getValor()) {
            // Retorna 1 se o objeto comparado for menor que este objeto. (deve vir antes na ordenação)
            // return -1;
        // }
        // if (this.getValor() > outro.getValor()) {
            // Retorna 1 se o objeto comparado for maior que este objeto. (deve vir depois na ordenação)
            // return 1;
        // }
        // Retorna 0 se o objeto comparado for igual a este objeto.
        // return 0;
    }

    boolean temAutor() {
        return this.autor != null;
    }

    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }




}