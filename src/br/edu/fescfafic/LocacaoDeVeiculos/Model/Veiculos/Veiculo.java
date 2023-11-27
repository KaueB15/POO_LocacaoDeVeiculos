package br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos;

public abstract class Veiculo {
    private String placaDoVeiculo;
    private String modeloDoVeiculo;
    private int anoDoVeiculo;
    private String combustivelUsado;
    private boolean portaMalas;

    public Veiculo() {

    }

    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }

    public void setPlacaDoVeiculo(String placaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;
    }

    public String getModeloDoVeiculo() {
        return modeloDoVeiculo;
    }

    public void setModeloDoVeiculo(String modeloDoVeiculo) {
        this.modeloDoVeiculo = modeloDoVeiculo;
    }

    public int getAnoDoVeiculo() {
        return anoDoVeiculo;
    }

    public void setAnoDoVeiculo(int anoDoVeiculo) {
        this.anoDoVeiculo = anoDoVeiculo;
    }

    public String getCombustivelUsado() {
        return combustivelUsado;
    }

    public void setCombustivelUsado(String combustivelUsado) {
        this.combustivelUsado = combustivelUsado;
    }

    public boolean isPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(boolean portaMalas) {
        this.portaMalas = portaMalas;
    }


}
