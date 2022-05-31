package com.example.weserv.boundary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.weserv.R;
import com.example.weserv.control.ControleCategoria;
import com.example.weserv.entity.Categoria;

import java.util.ArrayList;

public class TelaCategoria extends AppCompatActivity {
    LinearLayout coluna_vertical;
    ControleCategoria controleCategoria = new ControleCategoria();
    ArrayList<Categoria> categorias = controleCategoria.getCategoria();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_categoria);

        desenharTela();
    }

    private void desenharTela(){
        coluna_vertical = findViewById(R.id.coluna_vertical);

        for(int i =0; i < categorias.size(); i++){
            Button teste = new Button(TelaCategoria.this);
            teste.setText(categorias.get(i).getNome());
            teste.setId(categorias.get(i).getId());
            coluna_vertical.addView(teste);
        }
    }
}