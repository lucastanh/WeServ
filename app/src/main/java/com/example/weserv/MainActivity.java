package com.example.weserv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.weserv.boundary.TelaPedidos;
import com.example.weserv.boundary.TelaServico;
import com.example.weserv.control.ControleCliente;

public class MainActivity extends AppCompatActivity {
    private ControleCliente controleCLiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int codigoCliente = getIntent().getIntExtra("codigoCliente", 0);
        this.controleCLiente = new ControleCliente(codigoCliente);

        TextView textViewBoasVindas = findViewById(R.id.nomeCliente);
        String nomeCliente = controleCLiente.getCliente().getNome();
        String boasVindas = "Olá, " + nomeCliente;
        textViewBoasVindas.setText(boasVindas);
    }

    public void pedirServico(View view){
        Intent it_telaServico = new Intent(this, TelaServico.class);
        it_telaServico.putExtra("codigoCliente", this.controleCLiente.getCliente().getCodigo());
        startActivity(it_telaServico);
    }

    public void visualizarPedidos(View view){
        Intent it_telaPedidos = new Intent(MainActivity.this, TelaPedidos.class);
        it_telaPedidos.putExtra("codigoCliente", this.controleCLiente.getCliente().getCodigo());
        startActivity(it_telaPedidos);
    }

}