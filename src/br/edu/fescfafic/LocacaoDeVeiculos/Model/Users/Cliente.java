package br.edu.fescfafic.LocacaoDeVeiculos.Model.Users;

public class Cliente extends User{
    private boolean habilitado;
    private String tipoDeHabilitacao;

    public Cliente(int id, String cpf, String nome, int idade, String login, String senha, boolean habilitado, String tipoDeHabilitacao) {
        super(id, cpf, nome, idade, login, senha);
        this.habilitado = habilitado;
        this.tipoDeHabilitacao = tipoDeHabilitacao;
    }
}
