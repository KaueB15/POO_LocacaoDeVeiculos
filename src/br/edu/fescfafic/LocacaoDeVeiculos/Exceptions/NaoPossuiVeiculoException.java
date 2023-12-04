package br.edu.fescfafic.LocacaoDeVeiculos.Exceptions;

public class NaoPossuiVeiculoException extends RuntimeException{
    public NaoPossuiVeiculoException(){
        super("ERRO > Nenhum veiculo cadastrado");
    }
}
