package br.edu.fescfafic.LocacaoDeVeiculos.Exceptions;

public class PlacaJaExistenteException extends RuntimeException{
    public PlacaJaExistenteException(){
        super("ERRO > Já possui um veiculo com essa placa");
    }
}
