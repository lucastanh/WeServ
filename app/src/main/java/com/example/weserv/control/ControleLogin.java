package com.example.weserv.control;

import com.example.weserv.conexao.Dados;
import com.example.weserv.entity.Login;

import java.util.ArrayList;

public class ControleLogin {


    // Função para validar informações de login recebidos da tela de login
    public int validarLogin(String email, String senha){

        // consulta ao banco de dados trazendo todos os logins
        ArrayList<Login> logins = Dados.logins;

        // comparando os dados recebidos da tela com os dados de login
        for(int i = 0; i < logins.size(); i++){
            Login login = logins.get(i);
            String emailBanco = (String) login.getEmail();
            String senhaBanco = login.getSenha();

            if(email.intern() == emailBanco.intern() && senha.intern() == senhaBanco.intern()){// caso email e senha estejam no banco de dados, o login é válido
                return login.getCodigoCliente();
            }
        }

        return -1;

    }
}
