package com.example.weserv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.weserv.boundary.TelaCategoria;
import com.example.weserv.boundary.TelaServico;
import com.example.weserv.control.ControleCliente;
import com.example.weserv.entity.Cliente;

public class MainActivity extends AppCompatActivity {
    Cliente cliente = ControleCliente.getCliente(1);

    TextView nomeCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeCliente = findViewById(R.id.nomeCliente);
        nomeCliente.setText("Olá, " + cliente.getNome());
    }

    // inicia a intenção de pedir um serviço
    public void pedirServico(View view){
        Intent it_telaCategoria = new Intent(MainActivity.this, TelaServico.class);
        startActivity(it_telaCategoria);
    }

}