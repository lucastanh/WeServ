package com.example.weserv.boundary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weserv.R;
import com.example.weserv.conexao.Dados;
import com.example.weserv.control.ControleServico;
import com.example.weserv.entity.Servico;

import java.util.ArrayList;

public class TelaPedidos extends AppCompatActivity {

    ConstraintLayout semPedido;
    LinearLayout pedidosContainer;
    ControleServico controleServico;

    public TelaPedidos(){
        this.controleServico = new ControleServico();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pedidos);

        int codigoCliente = getIntent().getIntExtra("codigoCliente", 0);

        semPedido = findViewById(R.id.semPedidos);
        pedidosContainer = findViewById(R.id.pedidosContainer);

        desenharTela();
    }

    private void desenharTela(){
        ArrayList<Servico> servicos = Dados.servicos;

        if(servicos.size() == 0){
            semPedido.setVisibility(View.VISIBLE);
        } else {
            pedidosContainer.setVisibility(View.VISIBLE);

            for(int i = 0; i < servicos.size(); i++){
                ConstraintLayout pedido_layout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.pedido_layout, null);

                TextView categoria, tipoServico, localServico;

                categoria = pedido_layout.findViewById(R.id.categoria);
                tipoServico = pedido_layout.findViewById(R.id.tipoServico);
                localServico = pedido_layout.findViewById(R.id.localServico);

                categoria.setText(servicos.get(i).getCategoria().getNomeCategoria());
                tipoServico.setText(servicos.get(i).getTipoServico().getNomeTipoServico());
                localServico.setText(servicos.get(i).getLocalServico().getNomeLocalServico());

                pedidosContainer.addView(pedido_layout);
            }

        }

    }
}

