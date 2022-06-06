package com.example.weserv.entity;

import java.util.Date;

public class Cliente extends Pessoa{
    private boolean possuiAnimais;
    private boolean possuiCriancas;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String dataNascimento, String cpf, String celular, String email, char tipo, boolean possuiAnimais, boolean possuiCriancas) {
        super(codigo, nome, dataNascimento, cpf, celular, email, tipo);
        this.possuiAnimais = possuiAnimais;
        this.possuiCriancas = possuiCriancas;
    }

    public boolean isPossuiAnimais() {
        return possuiAnimais;
    }

    public void setPossuiAnimais(boolean possuiAnimais) {
        this.possuiAnimais = possuiAnimais;
    }

    public boolean isPossuiCriancas() {
        return possuiCriancas;
    }

    public void setPossuiCriancas(boolean possuiCriancas) {
        this.possuiCriancas = possuiCriancas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "possuiAnimais=" + possuiAnimais +
                ", possuiCriancas=" + possuiCriancas +
                '}';
    }
}
