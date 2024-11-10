/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projeto_observatorio;

/**
 *
 * @author savio
 */
public interface InterfaceObservatorio {

    public void adicionarVisitante(Visitante visitante);

    public void removerVisitante(Visitante visitante);

    public int totalVisitantesAssociados();

    public int totalVisitantesNaoAssociados();

    public String relatorioVisitantes();
}
