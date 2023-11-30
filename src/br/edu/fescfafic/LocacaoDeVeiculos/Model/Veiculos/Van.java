package br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos;

public class Van extends Veiculo{
    private String tipo = "Van";
    private int quantidadeDePassageiros = 18;

    public Van(String placaDoVeiculo, String modeloDoVeiculo, int anoDoVeiculo, String combustivelUsado, String marcaDoVeiculo) {
        super(placaDoVeiculo, modeloDoVeiculo, anoDoVeiculo, combustivelUsado, marcaDoVeiculo);
    }
}
