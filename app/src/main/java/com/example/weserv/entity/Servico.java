package com.example.weserv.entity;

public class Servico {
    private int codigo;
    private Categoria categoria;
    private TipoServico tipoServico;

    public Servico() {
    }

    public Servico(Categoria categoria, TipoServico tipoServico) {
        this.categoria = categoria;
        this.tipoServico = tipoServico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "categoria=" + categoria.toString() +
                ", tipoServico=" + tipoServico.toString() +
                '}';
    }
}
