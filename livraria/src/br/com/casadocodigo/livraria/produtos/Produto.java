package br.com.casadocodigo.livraria.produtos;

public interface Produto extends Comparable<Produto> {
    
    // Omitido antes do double: public abstract
    double getValor();
}