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
    private LinearLayout buttonContainter;
    private View view;

    private TelaServico ts;

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
        ArrayList<Categoria> categorias = controleCategoria.getCategoria();
        buttonContainter = view.findViewById(R.id.buttonContainter);

        for (int i = 0; i < categorias.size(); i++) {
            Button categoriaButton = new Button(getContext());

            categoriaButton.setText(categorias.get(i).getNomeCategoria());
            categoriaButton.setId(categorias.get(i).getId());
            categoriaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int buttonID = v.getId();
                    int id = buttonID - 1;
                    ts.telaTipoServico(categorias.get(id));
                }
            });

            buttonContainter.addView(categoriaButton);
        }
    }

}
