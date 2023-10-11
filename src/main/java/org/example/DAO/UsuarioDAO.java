package org.example.DAO;

import org.example.conexao.App;
import org.example.entity.Usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    // QUERY DO SQL PARA COLOCAR OS DADOS NO DB
    public void cadastrarUsuario(Usuario usuario){

        String sql = "INSERT INTO registro (nome, profissao, idade) VALUES (?, ?, ?)";

        PreparedStatement ps;

        try {
            // PARAMETERINDEX = colocar conforme está no query acima
            ps = App.connection().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getProfissao());
            ps.setInt(3, usuario.getIdade());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
