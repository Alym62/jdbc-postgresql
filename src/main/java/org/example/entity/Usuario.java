package org.example.entity;

public class Usuario {

    // OS ATRIBUTOS TEM QUE SER COLOCADOS IGUAL ESTÁ NO DB
    private String nome;
    private String profissao;
    private Integer idade;

    // GETS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
