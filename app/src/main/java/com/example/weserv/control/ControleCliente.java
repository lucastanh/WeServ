package com.example.weserv.control;

import com.example.weserv.conexao.Dados;
import com.example.weserv.entity.Cliente;

import java.util.ArrayList;

public class ControleCliente {
    Cliente cliente;

    public ControleCliente(int codigoCliente){
        this.cliente = this.getCliente(codigoCliente);
    }

    public static Cliente getCliente(int codigoCliente){
        ArrayList<Cliente> clientes = Dados.clientes;

        for(int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);

            if(cliente.getCodigo() == codigoCliente){
                return cliente;
            }
        }
        return null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
