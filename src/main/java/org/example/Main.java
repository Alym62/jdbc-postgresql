package org.example;

import org.example.DAO.UsuarioDAO;
import org.example.entity.Usuario;

public class Main {
    public static void main(String[] args) {


        Usuario u = new Usuario();
        u.setNome("Rodolfo");
        u.setProfissao("Dev");
        u.setIdade(20);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuario(u);
    }
}