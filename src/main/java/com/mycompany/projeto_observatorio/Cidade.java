package com.mycompany.projeto_observatorio;
public class Cidade {
    private int codigo;
    private String nome;
    private String estado;

    public Cidade(int codigo, String nome, String estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Cidade{" + "codigo=" + codigo + ", nome=" + nome + ", estado=" + estado + '}';
    }
    
}
