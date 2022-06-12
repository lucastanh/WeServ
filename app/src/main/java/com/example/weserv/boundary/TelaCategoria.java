package com.example.weserv.boundary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.weserv.R;
import com.example.weserv.control.ControleCategoria;
import com.example.weserv.entity.Categoria;

import java.util.ArrayList;

public class TelaCategoria extends Fragment {
    private ControleCategoria controleCategoria;

    private View view;

    private TelaServico ts;

    public TelaCategoria(){

    }

    public TelaCategoria(TelaServico ts){
        this.ts = ts;
        this.controleCategoria = new ControleCategoria();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tela_categoria, container, false);

        desenharTela();

        return view;
    }

    private void desenharTela() {
        Categoria[] categorias = controleCategoria.getCategoria();

        LinearLayout categoriaButtonContainter = view.findViewById(R.id.categoriaButtonContainer);

        for (int i = 0; i < categorias.length; i++) {
            Button categoriaButton = new Button(getContext());

            categoriaButton.setText(categorias[i].getNomeCategoria());
            categoriaButton.setId(categorias[i].getId());

            categoriaButton.setOnClickListener(v -> {
                int buttonID = v.getId();
                int id = buttonID - 1;

                ts.telaTipoServico(categorias[id]);
            });

            categoriaButtonContainter.addView(categoriaButton);
        }
    }

}
