package br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos;

import br.edu.fescfafic.LocacaoDeVeiculos.Interfaces.IVeiculo;

public abstract class Veiculo implements IVeiculo {
    private String placaDoVeiculo;
    private String modeloDoVeiculo;
    private int anoDoVeiculo;
    private String combustivelUsado;
    private String marcaDoVeiculo;
    private boolean alugado;

    public Veiculo(String placaDoVeiculo, String modeloDoVeiculo, int anoDoVeiculo, String combustivelUsado, String marcaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;
        this.modeloDoVeiculo = modeloDoVeiculo;
        this.anoDoVeiculo = anoDoVeiculo;
        this.combustivelUsado = combustivelUsado;
        this.marcaDoVeiculo = marcaDoVeiculo;
        this.alugado = false;
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
    public String getMarcaDoVeiculo() {
        return this.marcaDoVeiculo;
    }

    @Override
    public boolean getAlugado() {
        return this.alugado;
    }

    @Override
    public void setMarcaDoVeiculo(String marca) {
        this.marcaDoVeiculo = marca;
    }

    @Override
    public void setModeloDoVeiculo(String modelo) {
        this.modeloDoVeiculo = modelo;
    }

    @Override
    public void setAnoDoVeiculo(int ano) {
        this.anoDoVeiculo = ano;
    }

    @Override
    public void setCombustivelUsado(String combustivel) {
        this.combustivelUsado = combustivel;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placaDoVeiculo='" + placaDoVeiculo + '\'' +
                ", modeloDoVeiculo='" + modeloDoVeiculo + '\'' +
                ", anoDoVeiculo=" + anoDoVeiculo +
                ", combustivelUsado='" + combustivelUsado + '\'' +
                ", marcaDoVeiculo='" + marcaDoVeiculo + '\'' +
                '}';
    }
}
