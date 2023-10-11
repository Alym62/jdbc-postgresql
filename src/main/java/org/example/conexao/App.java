package org.example.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    // CONEXÃO COM O DB POSTGRESQL
    private static final String url = "jdbc:postgresql://localhost:5432/<Nome do database>";
    private static final String user = "<Nome do user>";
    private static final String password = "<Senha se houver>";

    public static Connection connection(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("A conexão deu certo! 🟢");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return conn;
    }
}
