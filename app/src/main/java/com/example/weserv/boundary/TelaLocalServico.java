package com.example.weserv.boundary;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.weserv.R;
import com.example.weserv.control.ControleLocalServico;
import com.example.weserv.entity.LocalServico;

import java.util.ArrayList;

public class TelaLocalServico extends Fragment {
    private View v;
    private final TelaServico ts;
    private ControleLocalServico controleLocalServico;

    public TelaLocalServico(TelaServico ts){
        this.ts = ts;
        this.controleLocalServico = new ControleLocalServico();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_tela_local_servico, container, false);

        desenharTela();

        return v;
    }

    private void desenharTela(){
        LocalServico[] locaisServico = controleLocalServico.getLocaisServico();
        LinearLayout buttonContainer = v.findViewById(R.id.buttonContainer);

        for(int i = 0; i < locaisServico.length; i++) {
            Button buttonLocalServico = (Button)getLayoutInflater().inflate(R.layout.button, null);

            buttonLocalServico.setId(locaisServico[i].getId());
            buttonLocalServico.setText(locaisServico[i].getNomeLocalServico());

            buttonLocalServico.setOnClickListener(v -> {
                int buttonID = v.getId();
                int id = buttonID - 1;
                ts.setarDescricao(locaisServico[id]);
            });

            buttonContainer.addView(buttonLocalServico);
        }
    }

}