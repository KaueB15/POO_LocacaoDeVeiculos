package br.edu.fescfafic.LocacaoDeVeiculos.Interfaces;

import br.edu.fescfafic.LocacaoDeVeiculos.Model.Veiculos.Veiculo;

import java.util.ArrayList;

public interface IDao<T> {
    void listar();
    void adicionar(T objeto);
    void remover(Veiculo veiculo);
    void atualizar(String placa);
}
