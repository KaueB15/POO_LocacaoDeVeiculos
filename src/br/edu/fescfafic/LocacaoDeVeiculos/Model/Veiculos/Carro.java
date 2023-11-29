package br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos;

public class Carro extends Veiculo{
    public String tipo;
    private int quantidadeDePassageiros = 4;

    public Carro(){
        this.tipo = "Carro";
    }
}
