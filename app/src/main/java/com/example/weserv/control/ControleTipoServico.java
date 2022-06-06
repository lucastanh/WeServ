package com.example.weserv.control;

import com.example.weserv.entity.TipoServico;

import java.util.ArrayList;
import java.util.Dictionary;

public class ControleTipoServico {

        public ArrayList<TipoServico> getTipoServico(){
            ArrayList<TipoServico> tipoServicos = new ArrayList<>();

            tipoServicos.add(new TipoServico(1, "Limpeza para empresas"));
            tipoServicos.add(new TipoServico(2, "Limpeza comum(faxina dia-a-dia)"));
            tipoServicos.add(new TipoServico(3, "Limpeza pesada"));
            tipoServicos.add(new TipoServico(4, "Limpeza pós-obra"));
            tipoServicos.add(new TipoServico(5, "Limpeza pré-mudança"));

            return tipoServicos;
        }
}
