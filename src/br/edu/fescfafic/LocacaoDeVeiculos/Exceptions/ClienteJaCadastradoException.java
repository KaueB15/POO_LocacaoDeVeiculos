package br.edu.fescfafic.LocacaoDeVeiculos.Exceptions;

public class ClienteJaCadastradoException extends RuntimeException{
    public ClienteJaCadastradoException(){
        super("ERRO > Cliente já cadastrado");
    }
}
