package com.example.weserv.control;

import com.example.weserv.conexao.Dados;
import com.example.weserv.entity.TipoServico;

import java.util.ArrayList;
import java.util.Dictionary;

public class ControleTipoServico {

    public ControleTipoServico(){
    }

    public TipoServico[] getTiposServico(int idCategoria){
        TipoServico[] tiposServico = Dados.categorias[idCategoria - 1].getTiposServico();

        return tiposServico;
    }
}
