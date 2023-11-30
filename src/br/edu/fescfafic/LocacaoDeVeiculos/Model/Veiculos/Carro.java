package br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos;

public class Carro extends Veiculo{
    public String tipo = "Carro";
    private int quantidadeDePassageiros = 4;

    public Carro(String placaDoVeiculo, String modeloDoVeiculo, int anoDoVeiculo, String combustivelUsado, String marcaDoVeiculo) {
        super(placaDoVeiculo, modeloDoVeiculo, anoDoVeiculo, combustivelUsado, marcaDoVeiculo);
    }
}
