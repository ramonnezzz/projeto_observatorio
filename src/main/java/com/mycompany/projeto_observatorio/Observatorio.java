package com.mycompany.projeto_observatorio;
import java.util.ArrayList;
import java.util.List;

public class Observatorio implements InterfaceObservatorio {
    private int codigo;
    private Cidade cidade;
    private List<Visitante> visitantes;

    public Observatorio(int codigo, Cidade cidade) {
        this.codigo = codigo;
        this.cidade = cidade;
        this.visitantes = new ArrayList<>();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }

    @Override
    public void adicionarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }

    @Override
    public void removerVisitante(Visitante visitante) {
        visitantes.remove(visitante);
    }

    @Override
    public int totalVisitantesAssociados() {
        int count = 0;
        for (Visitante visitante : visitantes) {
            if (visitante instanceof VisitanteAssociado) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int totalVisitantesNaoAssociados() {
        int count = 0;
        for (Visitante visitante : visitantes) {
            if (!(visitante instanceof VisitanteAssociado)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String relatorioVisitantes() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Observatorio: Código ").append(codigo)
                 .append(", Cidade ").append(cidade.getNome()).append("\n");

        for (Visitante visitante : visitantes) {
            relatorio.append("Nome: ").append(visitante.getNome())
                     .append(", Cidade: ").append(visitante.getCidade().getNome());

            if (visitante instanceof VisitanteAssociado) {
                VisitanteAssociado associado = (VisitanteAssociado) visitante;
                relatorio.append(", Número Associação: ").append(associado.getAssociacao().getNumero());
            }
            relatorio.append("\n");
        }
        return relatorio.toString();
    }

    @Override
    public String toString() {
        return "Observatorio{" + "codigo=" + codigo + ", cidade=" + cidade + ", visitantes=" + visitantes + '}';
    }
    
}
