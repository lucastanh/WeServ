package com.example.weserv.control;

import com.example.weserv.conexao.Dados;
import com.example.weserv.entity.LocalServico;

import java.util.ArrayList;

public class ControleLocalServico {

    public ControleLocalServico(){
    }

    public static LocalServico[] getLocaisServico(){
        LocalServico[] locaisServico = Dados.locaisServico;

        return locaisServico;
    }
}
