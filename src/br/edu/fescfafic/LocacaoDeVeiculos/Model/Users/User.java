package br.edu.fescfafic.LocacaoDeVeiculos.Model.Users;

public abstract class User {
    private int id;
    private String cpf;
    private String nome;
    private int idade;
    private String senha;

    public User(int id, String cpf, String nome, int idade, String senha) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }
}
