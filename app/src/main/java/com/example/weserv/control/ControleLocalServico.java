package com.example.weserv.control;

import com.example.weserv.entity.LocalServico;

import java.util.ArrayList;

public class ControleLocalServico {

    public ArrayList<LocalServico> getLocalServico(){
        ArrayList<LocalServico> locaisServico = new ArrayList<>();

        locaisServico.add(new LocalServico(1, "Apartamento"));
        locaisServico.add(new LocalServico(2, "Casa"));
        locaisServico.add(new LocalServico(3, "Comercial/Escritório"));
        locaisServico.add(new LocalServico(4, "Condomínio"));
        locaisServico.add(new LocalServico(5, "Outro"));

        return locaisServico;
    }
}
