package br.edu.fescfafic.LocacaoDeVeiculos.Exceptions;

public class VeiculoNaoEncontradoException extends RuntimeException{
    public VeiculoNaoEncontradoException(){
        super("ERRO > Veiculo não encontrado");
    }
}
