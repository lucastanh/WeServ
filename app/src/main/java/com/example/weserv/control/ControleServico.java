package com.example.weserv.control;

import com.example.weserv.entity.Servico;

import java.util.ArrayList;

public class ControleServico {
    private Servico servico;

    public ControleServico(){
        this.servico = new Servico();
    }

    public Servico getServico() {
        return servico;
    }

}
