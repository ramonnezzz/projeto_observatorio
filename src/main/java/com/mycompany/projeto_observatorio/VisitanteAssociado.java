/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_observatorio;

/**
 *
 * @author savio
 */
public class VisitanteAssociado extends Visitante {
    private Associacao associacao;

    public VisitanteAssociado(String cpf, String nome, String telefone, Cidade cidade, Associacao associacao) {
        super(cpf, nome, telefone, cidade);
        this.associacao = associacao;
    }

    public Associacao getAssociacao() {
        return associacao;
    }

    @Override
    public String toString() {
        return "VisitanteAssociado{" + "associacao=" + associacao + '}';
    }
    
    
}
