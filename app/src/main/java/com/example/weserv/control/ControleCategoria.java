package com.example.weserv.control;

import com.example.weserv.boundary.TelaCategoria;
import com.example.weserv.conexao.Dados;
import com.example.weserv.entity.Categoria;

import java.util.ArrayList;

public class ControleCategoria {

    public ControleCategoria(){
    }

    public static Categoria[] getCategoria() {
        Categoria[] categorias = Dados.categorias;

        return categorias;
    }
}
