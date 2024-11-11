package com.mycompany.projeto_observatorio;
public class Associacao {
    private int numero;
    private String data;

    public Associacao(int numero, String data) {
        this.numero = numero;
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
