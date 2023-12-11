package br.edu.fescfafic.LocacaoDeVeiculos.Exceptions;

public class NaoPossuiClienteException extends RuntimeException{
    public NaoPossuiClienteException() {
        super("ERRO > Não possui cliente cadastrado");
    }
}
