/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_observatorio;

/**
 *
 * @author savio
 */
public class Visitante {
    private String cpf;
    private String nome;
    private String telefone;
    private Cidade cidade;
    
    public Visitante(){
    }
    
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

    public String getTelefone() {
        return telefone;
    }

    public Cidade getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return "Visitante{" + "cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", cidade=" + cidade + '}';
    }
}
