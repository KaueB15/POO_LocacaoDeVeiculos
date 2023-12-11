package br.edu.fescfafic.LocacaoDeVeiculos.Interfaces;

public interface IUser {
    int getID();
    String getNome();
    String getLogin();
    String getSenha();
    String getCPF();
    void setNome(String nome);
}
