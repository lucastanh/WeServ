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

    public TelaLocalServico(TelaServico ts){
        this.ts = ts;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_tela_local_servico, container, false);

        desenharTela();

        return v;
    }

    private void desenharTela(){
        ControleLocalServico controleLocalServico = new ControleLocalServico();
        ArrayList<LocalServico> locaisServico = controleLocalServico.getLocalServico();
        LinearLayout buttonContainer = v.findViewById(R.id.buttonContainer);

        for(int i = 0; i < locaisServico.size(); i++) {
            Button buttonLocalServico = new Button(getContext());

            buttonLocalServico.setId(locaisServico.get(i).getId());
            buttonLocalServico.setText(locaisServico.get(i).getNomeLocalServico());

            buttonLocalServico.setOnClickListener(v -> {
                int buttonID = v.getId();
                int id = buttonID - 1;
                ts.setarDescricao(locaisServico.get(id));
            });

            buttonContainer.addView(buttonLocalServico);
        }
    }

}