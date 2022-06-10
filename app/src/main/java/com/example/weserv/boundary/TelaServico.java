package com.example.weserv.boundary;

import androidx.appcompat.app.AppCompatActivity;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.weserv.MainActivity;
import com.example.weserv.R;
import com.example.weserv.conexao.Dados;
import com.example.weserv.control.ControleServico;
import com.example.weserv.entity.Categoria;
import com.example.weserv.entity.LocalServico;
import com.example.weserv.entity.TipoServico;

public class TelaServico extends AppCompatActivity {

    private final ControleServico controleServico;

    private TextView descricaoEscolha;
    private Button buttonVoltar;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private EditText descricaoServico;
    private ConstraintLayout descricaoLayout;

    public TelaServico(){
        controleServico = new ControleServico();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_servico);

        fm = getSupportFragmentManager();
        descricaoEscolha = findViewById(R.id.descricaoEscolha);
        buttonVoltar = findViewById(R.id.buttonVoltar);
        descricaoLayout = findViewById(R.id.descricaoLayout);
        descricaoServico = findViewById(R.id.descricaoServico);

        desenharTela();
    }

    private void desenharTela(){
        telaCategoria();
    }

    private void telaCategoria(){
        TelaCategoria tc = new TelaCategoria(this);

        setTextEscolha("Escolha uma categoria");

        ft = fm.beginTransaction();
        ft.add(R.id.fragmentContainer, tc);
        ft.commit();
    }

    public void telaTipoServico(Categoria categoria){
        this.controleServico.getServico().setCategoria(categoria);

        setTextEscolha("Qual serviço você procura");
        TelaTipoServico tts = new TelaTipoServico(this, categoria);
        ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainer, tts);
        ft.commit();
    }

    public void telaLocalServico(TipoServico tipoServico){
        this.controleServico.getServico().setTipoServico(tipoServico);

        setTextEscolha("Qual o local do serviço?");
        TelaLocalServico tls = new TelaLocalServico(this);
        ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainer, tls);
        ft.commit();
    }

    public void setarDescricao(LocalServico localServico){
        this.controleServico.getServico().setLocalServico(localServico);

        System.out.println(this.controleServico.getServico().toString());

        setTextEscolha("Descrição do serviço");
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        ft = fm.beginTransaction();
        assert fragment != null;
        ft.remove(fragment);
        ft.commit();

        descricaoLayout.setVisibility(View.VISIBLE);

    }

    public void concluirPedido(View view){
        String descricaoServicoText = descricaoServico.getText().toString();

        this.controleServico.getServico().setDescricao(descricaoServicoText);

        descricaoLayout.setVisibility(View.INVISIBLE);

        setarDescricaoPedidoFinalizado();
    }

    public void setarDescricaoPedidoFinalizado(){
        Dados.servicos.add(controleServico.getServico());

        setTextEscolha("Pedido realizado com sucesso");

        descricaoEscolha.setY((float) 300);
        buttonVoltar.setVisibility(View.VISIBLE);
    }

    public void voltarMenuPrincipal(View view){
        this.finish();
    }

    private void setTextEscolha(String mensagemDeEscolha){
        this.descricaoEscolha.setText(mensagemDeEscolha);
    }
}
