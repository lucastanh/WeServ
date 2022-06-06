package com.example.weserv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.weserv.boundary.TelaServico;
import com.example.weserv.boundary.TelaVisualizacaoPedidos;
import com.example.weserv.control.ControleCliente;
import com.example.weserv.entity.Cliente;

public class MainActivity extends AppCompatActivity {
    private final Cliente cliente = ControleCliente.getCliente(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewBoasVindas;
        textViewBoasVindas = findViewById(R.id.nomeCliente);
        String boasVindas = "Olá, " + cliente.getNome();
        textViewBoasVindas.setText(boasVindas);
    }

    public void pedirServico(View view){
        Intent it_telaServico = new Intent(MainActivity.this, TelaServico.class);
        it_telaServico.putExtra("codigoCliente", cliente.getCodigo());
        startActivity(it_telaServico);
    }

    public void visualizarPedidos(View view){
        Intent it_telaVisualizacaoPedidos = new Intent(MainActivity.this, TelaVisualizacaoPedidos.class);
        it_telaVisualizacaoPedidos.putExtra("codigoCliente", cliente.getCodigo());
        startActivity(it_telaVisualizacaoPedidos);
    }


}