package com.example.weserv.entity;

import java.util.Arrays;

public class Categoria {
    private int id;
    private String nomeCategoria;
    private TipoServico[] tiposServico;

    public Categoria() {
    }

    public Categoria(int id, String nome) {
        this.id = id;
        this.nomeCategoria = nome;

        switch (id) {
            case 1: {
                this.tiposServico = new TipoServico[]{
                        new TipoServico(1, "Limpeza para empresas"),
                        new TipoServico(2, "Limpeza comum(faxina dia-a-dia)"),
                        new TipoServico(3, "Limpeza pesada"),
                        new TipoServico(4, "Limpeza pós-obra"),
                        new TipoServico(5, "Limpeza pré-mudança")
                };
            } break;

            case 2: {
                this.tiposServico = new TipoServico[]{
                        new TipoServico(1, "Construção"),
                        new TipoServico(2, "Reforma"),
                        new TipoServico(3, "Instalações"),
                        new TipoServico(4, "Troca")
                };
            } break;

            case 3: {
                this.tiposServico = new TipoServico[]{
                        new TipoServico(1, ""),
                        new TipoServico(2, ""),
                        new TipoServico(3, ""),
                        new TipoServico(4, ""),
                        new TipoServico(5, "")
                };
            } break;

            case 4: {
                this.tiposServico = new TipoServico[]{
                        new TipoServico(1, ""),
                        new TipoServico(2, ""),
                        new TipoServico(3, ""),
                        new TipoServico(4, ""),
                        new TipoServico(5, "")
                };
            } break;
        }
    }

    public int getId() {
        return id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public TipoServico[] getTiposServico() {
        return tiposServico;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nomeCategoria='" + nomeCategoria + '\'' +
                ", tiposServico=" + Arrays.toString(tiposServico) +
                '}';
    }
}
