package com.example.weserv.conexao;

import com.example.weserv.entity.Categoria;
import com.example.weserv.entity.Cliente;
import com.example.weserv.entity.LocalServico;
import com.example.weserv.entity.Login;
import com.example.weserv.entity.Servico;

import java.io.Serializable;
import java.util.ArrayList;

public class Dados implements Serializable {
    // Dados de cliente
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>(){
        {
            add(new Cliente(1, "Lucas Vinicius", "13/11/00", "111.222.333-44", "44987654321", "lucas@email.com", 'c', true, true));
        }
    };

    // Dados de categoria
    public static Categoria[] categorias = new Categoria[]{
            new Categoria(1, "Diarista"),
            new Categoria(2, "Pedreiro"),
            new Categoria(3, "Ar Condicionado"),
            new Categoria(4, "Psicólogo")
    };

    // Dados de servico
    public static ArrayList<Servico> servicos = new ArrayList<>();
    public static ArrayList<Servico> getServicosCliente(int idCliente){
        ArrayList<Servico> servicos = Dados.servicos;

        ArrayList<Servico> servicosCliente = new ArrayList<>();

        for(int i = 0; i < servicos.size(); i++){
            Servico servico = servicos.get(i);
            int codigoCliente = servico.getCodigoCliente();

            if(codigoCliente == idCliente){
                servicosCliente.add(servico);
            }
        }

        return servicosCliente;
    }

    // Dados de login
    public static ArrayList<Login> logins = new ArrayList<Login>(){
        {
            add(new Login("", "", 1));
        }
    };

    // Dados de local de serviço
    public static LocalServico[] locaisServico = new LocalServico[]{
            new LocalServico(1, "Apartamento"),
            new LocalServico(2, "Casa"),
            new LocalServico(3, "Comercial/Escritório"),
            new LocalServico(4, "Condomínio"),
            new LocalServico(5, "Outro")
    };
}
