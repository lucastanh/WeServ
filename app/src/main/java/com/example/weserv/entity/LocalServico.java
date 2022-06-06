package com.example.weserv.entity;

public class LocalServico {
    private int id;
    private String nomeLocalServico;

    public LocalServico(int id, String nomeLocalServico) {
        this.id = id;
        this.nomeLocalServico = nomeLocalServico;
    }

    public int getId() {
        return id;
    }

    public String getNomeLocalServico() {
        return nomeLocalServico;
    }

    @Override
    public String toString() {
        return "LocalServico{" +
                "id=" + id +
                ", localServico='" + nomeLocalServico + '\'' +
                '}';
    }
}
