package br.com.fiap.banco;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private static final long serialVersionUID = 1L;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
