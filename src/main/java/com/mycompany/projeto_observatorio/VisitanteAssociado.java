package com.mycompany.projeto_observatorio;
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
