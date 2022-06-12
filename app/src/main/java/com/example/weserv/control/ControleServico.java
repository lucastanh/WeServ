package com.example.weserv.control;

import com.example.weserv.boundary.TelaServico;
import com.example.weserv.entity.Servico;

public class ControleServico {
    private Servico servico;

    public ControleServico(){
        this.servico = new Servico();
    }

    public Servico getServico() {
        return servico;
    }
}
