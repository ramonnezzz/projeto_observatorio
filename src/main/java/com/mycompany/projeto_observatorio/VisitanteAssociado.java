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

    public VisitanteAssociado(String cpf, String nome, String telefone, Cidade cidade) {
        super(cpf, nome, telefone, cidade);
    }
  
    public VisitanteAssociado(String cpf, String nome, String telefone, Cidade cidade, int numAssociacao, String dataAssociacao) {
        super(cpf, nome, telefone, cidade);
        associacao = new Associacao();
       
    }

    public Associacao getAssociacao() {
        return associacao;
    }

    public void setAssociacao(int numAssociacao, String dataAssociacao) {
        associacao = new Associacao(numAssociacao,dataAssociacao);
    }
    

    @Override
    public String toString() {
        return "VisitanteAssociado{" + "associacao=" + associacao + '}';
    }
    
    
}
