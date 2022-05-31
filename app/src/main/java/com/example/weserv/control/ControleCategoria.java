package com.example.weserv.control;

import com.example.weserv.entity.Categoria;

import java.util.ArrayList;

public class ControleCategoria {



    public ArrayList<Categoria> getCategoria() {
        ArrayList<Categoria> categorias = new ArrayList<>();

        categorias.add(new Categoria(1, "Diarista"));
        categorias.add(new Categoria(2, "Pedreiro"));
        categorias.add(new Categoria(3, "Motorista"));

        return categorias;
    }
}
