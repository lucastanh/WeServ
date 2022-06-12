package com.example.weserv.boundary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.weserv.MainActivity;
import com.example.weserv.R;
import com.example.weserv.control.ControleLogin;

public class TelaLogin extends AppCompatActivity {

    private ControleLogin controleLogin;

    private EditText editEmail;
    private EditText editSenha;

    public TelaLogin(){
        this.controleLogin = new ControleLogin();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);

    }

    public void buttonLogin(View v){
        String email = editEmail.getText().toString();
        String senha = editSenha.getText().toString();

        int codigoCliente = this.controleLogin.validarLogin(email, senha);

        if(codigoCliente != -1){
            Intent it_main = new Intent(this, MainActivity.class);
            it_main.putExtra("codigoCliente", codigoCliente);
            startActivity(it_main);
            finish();
        }
    }
}