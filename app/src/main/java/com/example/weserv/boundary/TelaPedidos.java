package com.example.weserv.boundary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.weserv.R;
import com.example.weserv.conexao.Dados;
import com.example.weserv.entity.Servico;

import java.util.ArrayList;

public class TelaPedidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pedidos);

        int codigoCliente = getIntent().getIntExtra("codigoCliente", 0);

        TextView teste = findViewById(R.id.teste);

        ArrayList<Servico> servicosCliente = Dados.getServicosCliente(codigoCliente);

        if(servicosCliente.size() == 0) {
            teste.setText("Ainda não há pedidos");
        } else {
            teste.setText(servicosCliente.get(0).getCategoria().getNomeCategoria());
        }
    }
}

