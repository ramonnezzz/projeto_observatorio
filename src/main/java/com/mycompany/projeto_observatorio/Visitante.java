package com.mycompany.projeto_observatorio;
public class Visitante {
    private String cpf;
    private String nome;
    private String telefone;
    private Cidade cidade;

    public Visitante(String cpf, String nome, String telefone, Cidade cidade) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Cidade getCidade() {
        return cidade;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Visitante{" + "cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", cidade=" + cidade + '}';
    }

    
}
