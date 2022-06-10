package com.example.weserv.conexao;

import com.example.weserv.entity.Categoria;
import com.example.weserv.entity.Cliente;
import com.example.weserv.entity.Servico;

import java.io.Serializable;
import java.util.ArrayList;

public class Dados implements Serializable {
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>(){
        {
            add(new Cliente(1, "Lucas Vinicius", "13/11/00", "111.222.333-44", "44987654321", "lucas@email.com", 'c', true, true));
        }
    };


    public static Categoria[] categorias;

    static {
        categorias = new Categoria[]{
                new Categoria(1, "Diarista"),
                new Categoria(2, "Pedreiro"),
                new Categoria(3, "Ar Condicionado"),
                new Categoria(4, "Psicólogo")
        };
    }


    public static ArrayList<Servico> servicos = new ArrayList<>();

    public static ArrayList<Servico> getServicosCliente(int idCliente){
        ArrayList<Servico> servicos = Dados.servicos;

        ArrayList<Servico> servicosCliente = new ArrayList<>();

        for(int i = 0; i < servicos.size(); i++){
            Servico servico = servicos.get(i);
            int codigoCliente = servico.getCodigoCliente();

            if(codigoCliente == idCliente){
                servicosCliente.add(servico);
            }
        }

        return servicosCliente;
    }




}
