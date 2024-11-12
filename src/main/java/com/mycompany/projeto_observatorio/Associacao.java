/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_observatorio;

/**
 *
 * @author savio
 */
public class Associacao {
    private int numero;
    private String data;
    
    public Associacao(){
    }
    
    public Associacao(int numero, String data) {
        this.numero = numero;
        this.data = data;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Associacao{" + "numero=" + numero + ", data=" + data + '}';
    }
    
    
}
