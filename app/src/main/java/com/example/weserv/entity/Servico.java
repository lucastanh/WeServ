package com.example.weserv.entity;

public class Servico {
    private int codigo;
    private int codigoCliente;
    private Categoria categoria;
    private TipoServico tipoServico;
    private LocalServico localServico;
    private String descricao;

    public Servico() {
    }

    public Servico(int codigo, int codigoCliente, Categoria categoria, TipoServico tipoServico, LocalServico localServico, String descricao) {
        this.codigo = codigo;
        this.codigoCliente = codigoCliente;
        this.categoria = categoria;
        this.tipoServico = tipoServico;
        this.localServico = localServico;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
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

    public LocalServico getLocalServico() {
        return localServico;
    }

    public void setLocalServico(LocalServico localServico) {
        this.localServico = localServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
