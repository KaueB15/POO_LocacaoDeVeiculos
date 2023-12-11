package br.edu.fescfafic.LocacaoDeVeiculos.Interfaces;

public interface IVeiculo {
    String getPlacaDoVeiculo();
    String getModeloDoVeiculo();
    int getAnoDoVeiculo();
    String getCombustivelUsado();
    String getMarcaDoVeiculo();
    boolean getAlugado();
    String getPessoaQueAlugou();
    void setMarcaDoVeiculo(String marca);
    void setModeloDoVeiculo(String modelo);
    void setAnoDoVeiculo(int ano);
    void setCombustivelUsado(String combustivel);
    void setAlugado(boolean alugado);
    void setPessoaQueAlugou(String pessoa);
}
