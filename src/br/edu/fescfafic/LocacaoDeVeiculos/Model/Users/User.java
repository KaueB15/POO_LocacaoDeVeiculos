package br.edu.fescfafic.LocacaoDeVeiculos.Model.Users;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IUser;

public abstract class User implements IUser {
    private int id;
    private String cpf;
    private String nome;
    private int idade;
    private String login;
    private String senha;

    public User(int id, String cpf, String nome, int idade, String login, String senha) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getLogin() {
        return this.login;
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    @Override
    public String getCPF() {
        return this.cpf;
    }
}
