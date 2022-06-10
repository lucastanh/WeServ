package com.example.weserv.control;

import com.example.weserv.conexao.Dados;
import com.example.weserv.entity.Cliente;

public class ControleCliente {

    public static Cliente getCliente(int id){
        Cliente cliente = Dados.clientes.get(id - 1);

        return cliente;
    }
}
