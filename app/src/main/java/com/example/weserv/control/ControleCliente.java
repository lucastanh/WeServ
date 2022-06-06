package com.example.weserv.control;

import com.example.weserv.entity.Cliente;

public class ControleCliente {

    public static Cliente getCliente(int id){

        // Lógica para instanciar cliente com o resultado da pesquisa no banco de dados com o id recebido e retorná-lo

        Cliente cliente = new Cliente(id, "Lucas Vinicius", "13/11/00", "111.222.333-44", "44987654321", "lucas@email.com", 'c', true, true);

        return cliente;
    }

}
