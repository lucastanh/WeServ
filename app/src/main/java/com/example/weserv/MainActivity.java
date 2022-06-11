package com.example.weserv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import com.example.weserv.boundary.TelaCategoria;
import com.example.weserv.boundary.TelaPedidos;
import com.example.weserv.boundary.TelaServico;
import com.example.weserv.conexao.Dados;
import com.example.weserv.control.ControleCliente;
import com.example.weserv.entity.Cliente;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private final Cliente cliente = ControleCliente.getCliente(1);
    int codigoCliente = cliente.getCodigo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewBoasVindas = findViewById(R.id.nomeCliente);
        String nomeCliente = cliente.getNome();
        String boasVindas = "Olá, " + nomeCliente;
        textViewBoasVindas.setText(boasVindas);
    }

    public void pedirServico(View view){
        Intent it_telaServico = new Intent(this, TelaServico.class);
        it_telaServico.putExtra("idCLiente", this.codigoCliente);
        startActivity(it_telaServico);
    }

    public void visualizarPedidos(View view){
        Intent it_telaPedidos = new Intent(MainActivity.this, TelaPedidos.class);
        it_telaPedidos.putExtra("idCliente", this.codigoCliente);
        startActivity(it_telaPedidos);
    }


}