package livraria;

public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Thiago Castilho");

        Livro livro = new Livro(autor);
        livro.setValor(59.90);

        System.out.println("Valor atual: " + livro.getValor());
        
        if (!livro.aplicaDescontoDe(0.4)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.getValor());
        }

    }

}