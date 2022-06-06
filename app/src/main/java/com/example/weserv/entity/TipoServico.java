package com.example.weserv.entity;

public class TipoServico {
    private int id;
    private String nomeTipoServico;

    public TipoServico(int id, String tipoServico) {
        this.id = id;
        this.nomeTipoServico = tipoServico;
    }

    public int getId() {
        return id;
    }

    public String getNomeTipoServico() {
        return nomeTipoServico;
    }

    @Override
    public String toString() {
        return "TipoServico{" +
                "id=" + id +
                ", tipoServico='" + nomeTipoServico + '\'' +
                '}';
    }
}
