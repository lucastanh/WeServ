package com.example.weserv.boundary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.weserv.R;
import com.example.weserv.control.ControleTipoServico;
import com.example.weserv.entity.Categoria;
import com.example.weserv.entity.TipoServico;

import java.util.ArrayList;

public class TelaTipoServico extends Fragment {
    private TelaServico ts;
    private ControleTipoServico controleTipoServico;
    private int idCategoria;

    private LinearLayout buttonContainer;
    private View view;

    public TelaTipoServico(TelaServico ts, int idCategoria){
        this.ts = ts;
        this.controleTipoServico = new ControleTipoServico();
        this.idCategoria = idCategoria;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_tela_categoria, container, false);

        desenharTela();

        return view;
    }

    private void desenharTela() {
        TipoServico[] tiposServico = controleTipoServico.getTiposServico(idCategoria);

        buttonContainer = view.findViewById(R.id.categoriaButtonContainer);

        for(int i = 0; i < tiposServico.length; i++){
            Button buttonTipoServico = (Button)getLayoutInflater().inflate(R.layout.button, null);

            buttonTipoServico.setId(tiposServico[i].getId());
            buttonTipoServico.setText(tiposServico[i].getNomeTipoServico());

            buttonTipoServico.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int buttonID = v.getId();
                    int id = buttonID - 1;
                    ts.telaLocalServico(tiposServico[id]);
                }
            });

            buttonContainer.addView(buttonTipoServico);
        }

    }

}
