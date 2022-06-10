package com.example.weserv.conexao;

import com.example.weserv.entity.Categoria;
import com.example.weserv.entity.Servico;

import java.io.Serializable;
import java.util.ArrayList;

public class Dados implements Serializable {
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
}
