package br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos;

public class Onibus extends Veiculo{
    private String tipo = "Onibus";
    private int quantidadeDePassageiros = 40;

    public Onibus(String placaDoVeiculo, String modeloDoVeiculo, int anoDoVeiculo, String combustivelUsado, String marcaDoVeiculo) {
        super(placaDoVeiculo, modeloDoVeiculo, anoDoVeiculo, combustivelUsado, marcaDoVeiculo);
    }
}
