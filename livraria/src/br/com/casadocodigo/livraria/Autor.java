package br.com.casadocodigo.livraria;

public class Autor {
    
    private String nome;
    private String email;
    private String cpf;

    @Override
    public String toString() {
        return "Nome: " + nome
        + "\nEmail: " + email
        + "\nCPF: " + cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Autor)) return false;
        Autor outro = (Autor) object;
        return this.nome.equals(outro.nome);
    }
}