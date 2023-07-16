package com.programandoseufuturo.exercicio_1.model;

import java.math.BigDecimal;

public class Cosmetico {
    private int id;
    private String nome;
    private Double preco;

    public Cosmetico(int id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Cosmetico() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
