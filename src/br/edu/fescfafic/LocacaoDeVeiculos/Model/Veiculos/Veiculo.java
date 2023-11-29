package br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IVeiculo;

public abstract class Veiculo implements IVeiculo {
    private String placaDoVeiculo;
    private String modeloDoVeiculo;
    private int anoDoVeiculo;
    private String combustivelUsado;

    public Veiculo(String placaDoVeiculo, String modeloDoVeiculo, int anoDoVeiculo, String combustivelUsado) {
        this.placaDoVeiculo = placaDoVeiculo;
        this.modeloDoVeiculo = modeloDoVeiculo;
        this.anoDoVeiculo = anoDoVeiculo;
        this.combustivelUsado = combustivelUsado;
    }

    @Override
    public String getPlacaDoVeiculo() {
        return this.placaDoVeiculo;
    }

    @Override
    public String getModeloDoVeiculo() {
        return this.modeloDoVeiculo;
    }

    @Override
    public int getAnoDoVeiculo() {
        return this.anoDoVeiculo;
    }

    @Override
    public String getCombustivelUsado() {
        return this.combustivelUsado;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placaDoVeiculo='" + placaDoVeiculo + '\'' +
                ", modeloDoVeiculo='" + modeloDoVeiculo + '\'' +
                ", anoDoVeiculo=" + anoDoVeiculo +
                ", combustivelUsado='" + combustivelUsado + '\'' +
                '}';
    }
}
