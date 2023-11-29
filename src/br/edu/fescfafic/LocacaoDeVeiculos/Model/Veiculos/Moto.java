package br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos;

public class Moto extends Veiculo{
    private String tipo = "Moto";
    private int quantidadeDePassageiros = 1;

    public Moto(String placaDoVeiculo, String modeloDoVeiculo, int anoDoVeiculo, String combustivelUsado) {
        super(placaDoVeiculo, modeloDoVeiculo, anoDoVeiculo, combustivelUsado);
    }
}
