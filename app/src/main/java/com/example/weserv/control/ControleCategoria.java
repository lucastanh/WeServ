package com.example.weserv.control;

import com.example.weserv.boundary.TelaCategoria;
import com.example.weserv.entity.Categoria;

import java.util.ArrayList;

public class ControleCategoria {
    private TelaCategoria tc;



    public ControleCategoria(TelaCategoria tc){
        this.tc = tc;
    }

    public ArrayList<Categoria> getCategoria() {
        ArrayList<Categoria> categorias = new ArrayList<>();

        categorias.add(new Categoria(1, "Diarista"));
        categorias.add(new Categoria(2, "Pedreiro"));
        categorias.add(new Categoria(3, "Ar condicionado"));
        categorias.add(new Categoria(4, "Psicólogo"));

        return categorias;
    }
}
