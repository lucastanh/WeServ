package com.example.weserv.entity;

public class Categoria {
    private int id;
    private String nomeCategoria;

    public Categoria() {
    }

    public Categoria(int id, String nome) {
        this.id = id;
        this.nomeCategoria = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nomeCategoria='" + nomeCategoria + '\'' +
                '}';
    }
}
