package com.example.weserv.entity;

public class Login {
    private String email;
    private String senha;
    private int codigoCliente;

    public Login() {
    }

    public Login(String email, String senha, int codigoCliente) {
        this.email = email;
        this.senha = senha;
        this.codigoCliente = codigoCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
