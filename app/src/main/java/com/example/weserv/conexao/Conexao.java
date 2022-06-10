package com.example.weserv.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public Connection getConexao(){
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/carrinhodecompra?serverTimezone=UTC", 
                "root", 
                "123456"
            );
            return conn;
        } catch(Exception e){
            System.out.print(e);
            return null;
        }
    }
}
