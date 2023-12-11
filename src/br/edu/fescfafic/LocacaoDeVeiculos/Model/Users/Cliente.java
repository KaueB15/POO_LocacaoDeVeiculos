package br.edu.fescfafic.LocacaoDeVeiculos.Model.Users;

public class Cliente extends User{
    private boolean habilitado;

    public Cliente(int id, String cpf, String nome, int idade, String login, String senha, boolean habilitado) {
        super(id, cpf, nome, idade, login, senha);
        this.habilitado = habilitado;
    }
}
