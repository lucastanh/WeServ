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
import com.example.weserv.entity.TipoServico;

import java.util.ArrayList;

public class TelaTipoServico extends Fragment {
    private ControleTipoServico controleTipoServico;
    private LinearLayout buttonContainer;
    private View view;
    private TelaServico ts;

    public TelaTipoServico(TelaServico ts){
        this.ts = ts;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_tela_categoria, container, false);

        desenharTela();

        return view;
    }

    private void desenharTela() {
        controleTipoServico = new ControleTipoServico();
        ArrayList<TipoServico> tipoServicos = controleTipoServico.getTipoServico();
        buttonContainer = view.findViewById(R.id.categoriaButtonContainer);

        for(int i = 0; i < tipoServicos.size(); i++){
            Button buttonTipoServico = new Button(getContext());

            buttonTipoServico.setId(tipoServicos.get(i).getId());
            buttonTipoServico.setText(tipoServicos.get(i).getNomeTipoServico());

            buttonTipoServico.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int buttonID = v.getId();
                    int id = buttonID - 1;
                    ts.telaLocalServico(tipoServicos.get(id));
                }
            });

            buttonContainer.addView(buttonTipoServico);
        }

    }

}
