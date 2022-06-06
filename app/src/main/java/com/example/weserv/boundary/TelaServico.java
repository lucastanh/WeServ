package com.example.weserv.boundary;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.widget.TextView;

import com.example.weserv.R;
import com.example.weserv.control.ControleServico;
import com.example.weserv.entity.Categoria;
import com.example.weserv.entity.TipoServico;

public class TelaServico extends AppCompatActivity {
    private TextView escolha;
    private ControleServico controleServico;
    private FragmentManager fm;
    private FragmentTransaction ft;

    public TelaServico(){
        controleServico = new ControleServico();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_servico);

        fm = getSupportFragmentManager();
        escolha = findViewById(R.id.descricao);

        telaCategoria();
    }

    private void telaCategoria(){
        TelaCategoria tc = new TelaCategoria(this);
        ft = fm.beginTransaction();
        ft.add(R.id.fragmentContainer, tc);
        ft.commit();
    }

    public void telaTipoServico(Categoria categoria){
        this.controleServico.getServico().setCategoria(categoria);

        setTextEscolha("Qual serviço você procura");
        TelaTipoServico tts = new TelaTipoServico(this);
        ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainer, tts);
        ft.commit();
    }

    public void telaLocalServico(TipoServico tipoServico){
        this.controleServico.getServico().setTipoServico(tipoServico);

        System.out.println(this.controleServico.getServico().toString());

        setTextEscolha("Qual o local do serviço?");
        TelaLocalServico tls = new TelaLocalServico(this);
        ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainer, tls);
        ft.commit();

    }

    private void setTextEscolha(String mensagemDeEscolha){
        this.escolha.setText(mensagemDeEscolha);
    }

}
