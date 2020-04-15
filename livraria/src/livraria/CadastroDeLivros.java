package livraria;

public class CadastroDeLivros {

    public static void main(String[] args) {
        
        Autor autor = new Autor();

        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br"); 
        autor.setCpf("123.456.789-10"); 

        Livro livro = new Livro(autor);

        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");

        livro.mostraDetalhes();


        Autor outroAutor = new Autor();

        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789-10");

        Livro outroLivro = new Livro(outroAutor);

        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("978-85-66250-22-0");

        outroLivro.mostraDetalhes();


    }
    
}