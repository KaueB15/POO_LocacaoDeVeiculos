package br.edu.fescfafic.LocacaoDeVeiculos.Model.Users;

public class Gerente extends User{
    private boolean permissaoSistema;
    public Gerente(int id, String cpf, String nome, int idade, String senha) {
        super(id, cpf, nome, idade, senha);
        this.permissaoSistema = true;
    }
}
