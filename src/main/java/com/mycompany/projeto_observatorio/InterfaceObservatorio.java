package com.mycompany.projeto_observatorio;
public interface InterfaceObservatorio {

    public void adicionarVisitante(Visitante visitante);

    public void removerVisitante(Visitante visitante);

    public int totalVisitantesAssociados();

    public int totalVisitantesNaoAssociados();

    public String relatorioVisitantes();
}
